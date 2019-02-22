package com.wenzhi.novel.controller;

import com.wenzhi.novel.entity.request.NovelTypeRequest;
import com.wenzhi.novel.entity.response.NovelTypeResponse;
import com.wenzhi.novel.service.bussiness.NovelTypeService;
import com.wenzhi.novel.util.ResponseTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/novelType")
@Api(description = "小说分类列表")
public class NovelTypeController {

    @Autowired
    private NovelTypeService novelTypeService;

    @RequestMapping(value = "/editNovelType.do", method = RequestMethod.POST)
    @ApiOperation(value = "添加/编辑小说类型", notes = "添加/编辑小说类型", httpMethod = "POST")
    public ResponseTool editNovelType(NovelTypeRequest novelTypeRequest) throws Exception{
        return novelTypeService.editNovelType(novelTypeRequest);
    }

    @RequestMapping(value = "/checkTypeByName.do", method = RequestMethod.POST)
    @ApiOperation(value = "通过类型名称查询/查询全部小说类型", notes = "通过类型名称查询/查询全部小说类型", httpMethod = "POST")
    public ResponseTool<List<NovelTypeResponse>> checkTypeByName(NovelTypeRequest novelTypeRequest){
        return novelTypeService.checkTypeByName(novelTypeRequest);
    }
}
