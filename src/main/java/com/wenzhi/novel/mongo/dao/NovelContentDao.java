package com.wenzhi.novel.mongo.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.wenzhi.novel.hardcode.Tables;
import com.wenzhi.novel.mongo.model.NovelContent;
import com.wenzhi.novel.mongo.model.NovelType;
import com.wenzhi.novel.mongo.util.MongoTemplateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NovelContentDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MongoTemplateUtil mongoTemplateUtil;

    /**
     * 插入小说内容
     * @param novelContent
     */
    public void insertNovelContent(NovelContent novelContent) throws Exception{
        mongoTemplate.insert(novelContent, Tables.EMongoTable.novelContent.tableName);
    }

    /**
     * 更新小说内容
     * @param novelContent
     * @return
     * @throws Exception
     */
    public boolean updateNovelContent(NovelContent novelContent) throws Exception{
        return mongoTemplateUtil.updateCommon(novelContent, NovelContent.class, Tables.EMongoTable.novelContent.tableName);
    }

    public List<NovelType> ge5s(String novelId){
        BasicDBObject queryObject =  new BasicDBObject();
        queryObject.put("novelId", novelId);
        queryObject.put("isDeleted", 0);
        BasicDBObject fieldsObject =  new BasicDBObject();
        fieldsObject.put("titleId", true);
        fieldsObject.put("title", true);
        Query query=new BasicQuery(queryObject.toJson(), fieldsObject.toJson());
        List<NovelType> dataList = mongoTemplate.find(query, NovelType.class, Tables.EMongoTable.novelType.tableName);
        return dataList;
    }
}
