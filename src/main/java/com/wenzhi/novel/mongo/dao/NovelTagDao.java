package com.wenzhi.novel.mongo.dao;

import com.wenzhi.novel.hardcode.Tables;
import com.wenzhi.novel.mongo.model.NovelTag;
import com.wenzhi.novel.mongo.model.NovelType;
import com.wenzhi.novel.mongo.util.MongoTemplateUtil;
import com.wenzhi.novel.mongo.util.MongoUtil;
import com.wenzhi.novel.util.BaseException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static com.wenzhi.novel.hardcode.EExceptionCode.EErrorCode.MONGO_NOVELTAG_DUPLICATE;
import static com.wenzhi.novel.hardcode.EExceptionCode.EErrorCode.MONGO_NOVELTYPE_DUPLICATE;

@Component
public class NovelTagDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MongoTemplateUtil mongoTemplateUtil;

    /**
     * 插入小说类型
     * @param novelTag
     */
    public void insertTag(NovelTag novelTag) throws Exception{
        if(!CollectionUtils.isEmpty(this.getTagByName(novelTag.getTagName()))){
            throw new BaseException(MONGO_NOVELTAG_DUPLICATE.getCodeStr(), MONGO_NOVELTAG_DUPLICATE.getDesc());
        }
        novelTag.setTagId(MongoUtil.getNextSequence(mongoTemplate, Tables.EMongoTable.novelTag.tableName));
        mongoTemplate.insert(novelTag, Tables.EMongoTable.novelTag.tableName);
    }

    /**
     * 更新小说标签
     * @param novelTag
     * @return
     * @throws Exception
     */
    public boolean updateTag(NovelTag novelTag) throws Exception{
        List<NovelTag> dataList = this.getTagByName(novelTag.getTagName());
        if(!CollectionUtils.isEmpty(dataList) && !dataList.get(0).getId().equals(novelTag.getId())){
            throw new BaseException(MONGO_NOVELTAG_DUPLICATE.getCodeStr(), MONGO_NOVELTAG_DUPLICATE.getDesc());
        }
        return mongoTemplateUtil.updateCommon(novelTag, NovelTag.class, Tables.EMongoTable.novelTag.tableName);
    }

    /**
     * 通过标签名称查找标签
     * @param tagName
     * @return
     */
    public List<NovelTag> getTagByName(String tagName){
        Query query=new Query();
        if(!StringUtils.isEmpty(tagName)){
            query.addCriteria(Criteria.where("tagName").is(tagName));
        }
        query.addCriteria(Criteria.where("isDeleted").is(0));
        List<NovelTag> dataList = mongoTemplate.find(query, NovelTag.class, Tables.EMongoTable.novelTag.tableName);
        return dataList;
    }

}
