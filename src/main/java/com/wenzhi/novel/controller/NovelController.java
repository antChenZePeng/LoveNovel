package com.wenzhi.novel.controller;

import com.wenzhi.novel.entity.request.NovelRequest;
import com.wenzhi.novel.mongo.dao.NovelListDAO;
import com.wenzhi.novel.mongo.model.NovelList;
import com.wenzhi.novel.mysql.model.PG_NovelList;
import com.wenzhi.novel.service.basisservice.PG_NovelListService;
import com.wenzhi.novel.service.bussiness.NovelService;
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
    private NovelService novelService;

    @RequestMapping(value = "/findNovelByType.do", method = RequestMethod.POST)
    @ApiOperation(value = "通过小说类型查询小说", notes = "通过小说类型查询小说", httpMethod = "POST")
    public ResponseTool findNovelByType(NovelRequest novelRequest){
        return novelService.findNovelByType(novelRequest);
    }

    @RequestMapping(value = "/checkNovelName.do", method = RequestMethod.POST)
    @ApiOperation(value = "检查小说名字是否存在", notes = "检查小说名字是否存在", httpMethod = "POST")
    public ResponseTool checkNovelName(NovelRequest novelRequest){
        return novelService.checkNovelName(novelRequest);
    }

    @RequestMapping(value = "/editNovel.do", method = RequestMethod.POST)
    @ApiOperation(value = "添加/编辑小说", notes = "添加/编辑小说", httpMethod = "POST")
    public ResponseTool editNovel(NovelRequest novelRequest) throws Exception{
        return novelService.editNovel(novelRequest);
    }

}
