package com.wenzhi.novel.service.bussiness;

import com.wenzhi.novel.entity.request.UserWeixinRequest;
import com.wenzhi.novel.util.ResponseTool;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class UserInfoServcie {


    public ResponseTool addUserWeixinInfo(UserWeixinRequest userWeixinRequest) throws UnsupportedEncodingException {
        return ResponseTool.success(1);
    }
}
