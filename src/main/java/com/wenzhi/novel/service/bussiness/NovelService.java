package com.wenzhi.novel.service.bussiness;

import com.wenzhi.novel.entity.request.NovelRequest;
import com.wenzhi.novel.entity.response.NovelResponse;
import com.wenzhi.novel.mongo.dao.NovelListDAO;
import com.wenzhi.novel.mongo.model.NovelList;
import com.wenzhi.novel.mongo.util.MongoUtil;
import com.wenzhi.novel.util.ResponseTool;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.wenzhi.novel.hardcode.Symbol.Comma;

@Service
public class NovelService {

    @Autowired
    private NovelListDAO novelListDao;

    public ResponseTool<List<NovelResponse>> findNovelByType(NovelRequest novelRequest){
        List<NovelList> dataList = novelListDao.getNovelByType(novelRequest.getType());
        List<NovelResponse> resultList = new ArrayList<>();
        for(NovelList novel : dataList){
            resultList.add(NovelResponse.getResByNovelList(novel, novelRequest.getType()));
        }
        return ResponseTool.success(resultList);
    }

    public ResponseTool checkNovelName(NovelRequest novelRequest){
        List<NovelList> dataList = novelListDao.getNovelByName(novelRequest.getNovelName());
        if(!CollectionUtils.isEmpty(dataList)){
            return ResponseTool.success("该小说名字已经存在，确认继续添加?");
        }
        return ResponseTool.success("1");
    }

    public ResponseTool editNovel(NovelRequest novelRequest) throws Exception{
        if(StringUtils.isEmpty(novelRequest.getNovelName())){
            return ResponseTool.fail("小说名字不能为空");
        }
        if(novelRequest.getNovelStatus() == null){
            return ResponseTool.fail("小说状态不能为空");
        }
        if(novelRequest.getIsShow()==null){
            return ResponseTool.fail("小说显示状态不能为空");
        }
        if(StringUtils.isEmpty(novelRequest.getTypes())){
            return ResponseTool.fail("小说分类不能为空");
        }
        if(novelRequest.getSequence()==null){
            novelRequest.setSequence(1000);
        }
        if(novelRequest.getSequence()<0 || novelRequest.getSequence()>1000){
            return ResponseTool.fail("小说全局序号必须在1~1000之间");
        }
        if(StringUtils.isEmpty(novelRequest.getNovelAuthor())){
            novelRequest.setNovelAuthor("");
        }
        if(StringUtils.isEmpty(novelRequest.getNovelDesc())){
            novelRequest.setNovelDesc("");
        }
        if(StringUtils.isEmpty(novelRequest.getNovelImage())){
            novelRequest.setNovelImage("");
        }
        if(novelRequest.getIsDeleted()==null){
            novelRequest.setIsDeleted(0);
        }
        Date now = new Date(System.currentTimeMillis());
        NovelList novelList = new NovelList();
        novelList.setNovelName(novelRequest.getNovelName());
        novelList.setNovelDesc(novelRequest.getNovelDesc());
        novelList.setNovelAuthor(novelRequest.getNovelAuthor());
        novelList.setNovelImage(novelRequest.getNovelImage());
        novelList.setNovelStatus(novelRequest.getNovelStatus());
        novelList.setIsShow(novelRequest.getIsShow());
        novelList.setSequence(novelRequest.getSequence());
        List<Integer> types = new ArrayList<>();
        List<Double> typeSequences = new ArrayList<>();
        for(String type : novelRequest.getTypes().split(Comma)){
            types.add(Integer.valueOf(type));
            typeSequences.add(Integer.valueOf(type) + 0.1);
        }
        novelList.setType(types.toArray(new Integer[types.size()]));
        novelList.setTypeSequence(typeSequences.toArray(new Double[typeSequences.size()]));
        novelList.setIsDeleted(novelRequest.getIsDeleted());
        if(StringUtils.isEmpty(novelRequest.getId())){
            novelList.setCreateTime(now);
            novelList.setUpdateTime(now);
            novelListDao.insertNovel(novelList);
        }else {
            novelList.setId(novelRequest.getId());
            novelList.setUpdateTime(now);
            novelListDao.updateNovel(novelList);
        }
        return ResponseTool.success(1);
    }

}

