package com.wenzhi.novel.controller;

import com.wenzhi.novel.util.ResponseTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public ResponseTool test(){
        return ResponseTool.success(1);
    }

}
