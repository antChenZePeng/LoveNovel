package com.wenzhi.novel.aspect;

import com.alibaba.fastjson.JSONObject;
import com.wenzhi.novel.entity.request.BaseRequest;
import com.wenzhi.novel.util.BaseException;
import com.wenzhi.novel.util.ObtainIpAddressUtil;
import com.wenzhi.novel.util.ResponseTool;
import com.wenzhi.novel.hardcode.Symbol;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class ParamAspect {
    private static Logger log = LoggerFactory.getLogger(ParamAspect.class);

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private static final DecimalFormat decimalFormat = new DecimalFormat("000000");


    @Around("execution (* com.wenzhi.novel.controller.*.*Controller.*(..)) || execution (* com.wenzhi.novel.controller.*Controller.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pjd) throws IOException {
        Object result = null;
        String methodName = pjd.getSignature().getDeclaringTypeName() + "." + pjd.getSignature().getName();
        long begin = System.currentTimeMillis();
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        BaseRequest requestBody = null;
        for(Object arg : pjd.getArgs()){
            if(arg instanceof BaseRequest){
                requestBody = (BaseRequest)arg;
                requestBody.setIpAddress(ObtainIpAddressUtil.getIpAddr(request));
                requestBody.setReqTime(sdf.format(new Date(begin)));
            }
        }
        try {
            log.info(methodName+ Symbol.Comma + "[params]:"+ JSONObject.toJSONString(requestBody));
            result = pjd.proceed();
            log.info(methodName+ Symbol.Comma + "[costTime]:" + decimalFormat.format(System.currentTimeMillis() - begin));
            return result;
        }catch (BaseException be){
            result = ResponseTool.fail(be.getErrorCode(), be.getErrorMessage());
            return result;
        }catch(Throwable e) {
            log.error("The method " + methodName + " occurs expection  " ,e);
            return ResponseTool.fail(e.getMessage());
        }finally {
            if(result != null){
                log.info(methodName+ Symbol.Comma +"[return]:"+ ((ResponseTool)result).getState());
            }
        }
    }

}
