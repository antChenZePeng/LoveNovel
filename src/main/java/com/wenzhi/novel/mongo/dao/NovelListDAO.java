package com.wenzhi.novel.mongo.dao;

import com.wenzhi.novel.hardcode.Tables;
import com.wenzhi.novel.mongo.model.NovelList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NovelListDAO {

    @Autowired
    MongoTemplate mongoTemplate;

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
     * 插入小说
     * @param novelList
     */
    public void insertNovel(NovelList novelList){
        mongoTemplate.insert(novelList, Tables.EMongoTable.novelList.tableName);
    }



}
