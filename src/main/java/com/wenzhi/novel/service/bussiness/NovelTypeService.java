package com.wenzhi.novel.service.bussiness;

import com.wenzhi.novel.entity.request.NovelTypeRequest;
import com.wenzhi.novel.entity.response.NovelTypeResponse;
import com.wenzhi.novel.mongo.dao.NovelTypeDao;
import com.wenzhi.novel.mongo.model.NovelType;
import com.wenzhi.novel.util.ResponseTool;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NovelTypeService {

    @Autowired
    private NovelTypeDao novelTypeDao;

    public ResponseTool editNovelType(NovelTypeRequest novelTypeRequest) throws Exception{
        if(StringUtils.isEmpty(novelTypeRequest.getTypeName())){
            return ResponseTool.fail("小说分类类型不能为空");
        }
        if(novelTypeRequest.getTypeStatus()==null){
            return ResponseTool.fail("小说分类显示状态不能为空");
        }
        if(StringUtils.isEmpty(novelTypeRequest.getTypeDesc())){
            novelTypeRequest.setTypeDesc("");
        }
        if(StringUtils.isEmpty(novelTypeRequest.getTypeImage())){
            novelTypeRequest.setTypeImage("");
        }
        if(novelTypeRequest.getSequence()==null){
            novelTypeRequest.setSequence(1000);
        }
        if(novelTypeRequest.getIsDeleted()==null){
            novelTypeRequest.setIsDeleted(0);
        }
        Date now = new Date(System.currentTimeMillis());
        NovelType novelType = new NovelType();
        novelType.setTypeName(novelTypeRequest.getTypeName());
        novelType.setTypeDesc(novelTypeRequest.getTypeDesc());
        novelType.setTypeImage(novelTypeRequest.getTypeImage());
        novelType.setSequence(novelTypeRequest.getSequence());
        novelType.setTypeStatus(novelTypeRequest.getTypeStatus());
        novelType.setIsDeleted(novelTypeRequest.getIsDeleted());
        if(StringUtils.isEmpty(novelTypeRequest.getId())){
            novelType.setCreateTime(now);
            novelType.setUpdateTime(now);
            novelTypeDao.insertNovel(novelType);
        }else{
            novelType.setId(novelTypeRequest.getId());
            novelType.setUpdateTime(now);
            novelTypeDao.updateNovel(novelType);
        }
        return ResponseTool.success(1);
    }

    public ResponseTool<List<NovelTypeResponse>> checkTypeByName(NovelTypeRequest novelTypeRequest){
        List<NovelTypeResponse> resultList = new ArrayList<>();
        List<NovelType> dataList = novelTypeDao.getTypeByName(novelTypeRequest.getTypeName());
        if(CollectionUtils.isEmpty(dataList)){
            return ResponseTool.success(resultList);
        }
        for(NovelType novelType : dataList){
            resultList.add(NovelTypeResponse.getResByNovelType(novelType));
        }
        return ResponseTool.success(resultList);
    }


}
