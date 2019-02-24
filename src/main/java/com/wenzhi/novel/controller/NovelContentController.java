package com.wenzhi.novel.controller;

import com.wenzhi.novel.entity.request.NovelContentRequest;
import com.wenzhi.novel.entity.request.NovelRequest;
import com.wenzhi.novel.service.bussiness.NovelContentService;
import com.wenzhi.novel.util.ResponseTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/novelContent")
@Api(description = "小说内容")
public class NovelContentController {

    @Autowired
    private NovelContentService novelContentService;

    @RequestMapping(value = "/getNovelTitles.do", method = RequestMethod.POST)
    @ApiOperation(value = "查询小说全部章节列表", notes = "查询小说全部章节列表", httpMethod = "POST")
    public ResponseTool getNovelTitles(NovelContentRequest novelContentRequest){
        return novelContentService.getNovelTitles(novelContentRequest);
    }
}
