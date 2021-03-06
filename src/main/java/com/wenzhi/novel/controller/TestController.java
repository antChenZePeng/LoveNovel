package com.wenzhi.novel.controller;

import com.wenzhi.novel.mongo.dao.NovelListDao;
import com.wenzhi.novel.mongo.model.NovelList;
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
@RequestMapping(value = "/test")
@Api(description = "测试模块")
public class TestController {

    @Autowired
    private PG_NovelListService novelListService;

    @Autowired
    private NovelListDao novelListDao;

    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    @ApiOperation(value = "普通测试接口", notes = "普通测试接口", httpMethod = "GET")
    public ResponseTool test(){
        List<PG_NovelList> dataList = novelListService.getList();
        return ResponseTool.success(dataList);
    }

    @RequestMapping(value = "/testMongo.do", method = RequestMethod.GET)
    @ApiOperation(value = "mongo测试接口", notes = "mongo测试接口", httpMethod = "GET")
    public ResponseTool testMongo(){
        List<NovelList> dataList = novelListDao.getAllNovelList();
        return ResponseTool.success(dataList);
    }
}
