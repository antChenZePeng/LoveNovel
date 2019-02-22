package com.wenzhi.novel.mongo.dao;

import com.mongodb.WriteResult;
import com.mongodb.client.result.UpdateResult;
import com.wenzhi.novel.hardcode.Tables;
import com.wenzhi.novel.mongo.model.BaseMongoModel;
import com.wenzhi.novel.mongo.model.NovelList;
import com.wenzhi.novel.mongo.util.MongoTemplateUtil;
import com.wenzhi.novel.mongo.util.MongoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;

@Component
public class NovelListDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MongoTemplateUtil mongoTemplateUtil;

    /**
     * 查询全部小说
     * @return
     */
    public List<NovelList> getAllNovelList(){
        Query query=new Query();
        query.with(new Sort(new Sort.Order(Sort.Direction.DESC,"createTime")));
        List<NovelList> novelList = mongoTemplate.find(query, NovelList.class, Tables.EMongoTable.novelList.tableName);
        return novelList;
    }

    /**
     * 通过类型查询小说
     * @return
     */
    public List<NovelList> getNovelByType(Integer type){
        Query query=new Query();
        if(type != null){
            query.addCriteria(Criteria.where("type").is(type));
        }
        query.addCriteria(Criteria.where("isDeleted").is(0));
        List<NovelList> novelList = mongoTemplate.find(query, NovelList.class, Tables.EMongoTable.novelList.tableName);
        return novelList;
    }

    /**
     * 通过小说名称查找小说
     * @param novelName
     * @return
     */
    public List<NovelList> getNovelByName(String novelName){
        Query query=new Query();
        query.addCriteria(Criteria.where("novelName").is(novelName));
        query.addCriteria(Criteria.where("isDeleted").is(0));
        List<NovelList> novelList = mongoTemplate.find(query, NovelList.class, Tables.EMongoTable.novelList.tableName);
        return novelList;
    }

    /**
     * 插入小说
     * @param novelList
     */
    public void insertNovel(NovelList novelList){
        mongoTemplate.insert(novelList, Tables.EMongoTable.novelList.tableName);
    }

    public boolean updateNovel(NovelList newNovel) throws Exception{
        return mongoTemplateUtil.updateCommon(newNovel, NovelList.class, Tables.EMongoTable.novelList.tableName);
    }

}
