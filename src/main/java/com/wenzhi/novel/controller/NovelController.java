package com.wenzhi.novel.controller;

import com.wenzhi.novel.mysql.model.PG_NovelList;
import com.wenzhi.novel.service.basisservice.PG_NovelListService;
import com.wenzhi.novel.util.ResponseTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/novel")
@Api(description = "小说列表")
public class NovelController {

    @Autowired
    private PG_NovelListService novelListService;

    @RequestMapping(value = "/addNovel.do", method = RequestMethod.POST)
    @ApiOperation(value = "添加小说", notes = "添加小说", httpMethod = "POST")
    public ResponseTool addNovel(){
        List<PG_NovelList> dataList = novelListService.getList();
        return ResponseTool.success(dataList);
    }
}
