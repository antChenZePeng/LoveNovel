package com.wenzhi.novel.controller;

import com.wenzhi.novel.entity.request.UserWeixinRequest;
import com.wenzhi.novel.service.bussiness.UserInfoServcie;
import com.wenzhi.novel.util.ResponseTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/userInfo")
@Api(description = "普通通用接口")
public class UserInfoController {

    @Autowired
    private UserInfoServcie userInfoServcie;

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @RequestMapping(value = "/addUserWeixinInfo.do", method = RequestMethod.POST)
    @ApiOperation(value = "上传用户微信信息", notes = "上传用户微信信息", httpMethod = "POST")
    public ResponseTool addUserWeixinInfo(UserWeixinRequest userWeixinRequest) throws UnsupportedEncodingException {
        return userInfoServcie.addUserWeixinInfo(userWeixinRequest);
    }

}
