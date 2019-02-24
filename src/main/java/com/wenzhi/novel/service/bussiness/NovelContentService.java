package com.wenzhi.novel.service.bussiness;

import com.wenzhi.novel.entity.request.NovelContentRequest;
import com.wenzhi.novel.entity.request.NovelRequest;
import com.wenzhi.novel.entity.response.NovelContentResponse;
import com.wenzhi.novel.mongo.dao.NovelContentDao;
import com.wenzhi.novel.mongo.model.NovelType;
import com.wenzhi.novel.util.ResponseTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class NovelContentService {

    @Autowired
    private NovelContentDao novelContentDao;

    public ResponseTool<List<NovelContentResponse>> getNovelTitles(NovelContentRequest novelContentRequest){
        /*List<NovelContentResponse> resultList = new ArrayList<>();
        List<NovelType> dataList = novelContentDao.getTypeByName(novelContentRequest.getNovelId());
        if(CollectionUtils.isEmpty(dataList)){
            return ResponseTool.success(resultList);
        }
        for(NovelType){

        }*/
        return ResponseTool.success(null);
    }
}
