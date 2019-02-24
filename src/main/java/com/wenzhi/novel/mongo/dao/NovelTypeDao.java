package com.wenzhi.novel.mongo.dao;

import com.wenzhi.novel.hardcode.Tables;
import com.wenzhi.novel.mongo.model.NovelList;
import com.wenzhi.novel.mongo.model.NovelType;
import com.wenzhi.novel.mongo.util.MongoTemplateUtil;
import com.wenzhi.novel.util.BaseException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

import static com.wenzhi.novel.hardcode.EExceptionCode.EErrorCode.MONGO_NOVELTYPE_DUPLICATE;

@Component
public class NovelTypeDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private MongoTemplateUtil mongoTemplateUtil;

    /**
     * 插入小说类型
     * @param novelTpye
     */
    public void insertNovelType(NovelType novelTpye) throws Exception{
        if(!CollectionUtils.isEmpty(this.getTypeByName(novelTpye.getTypeName()))){
            throw new BaseException(MONGO_NOVELTYPE_DUPLICATE.getCodeStr(), MONGO_NOVELTYPE_DUPLICATE.getDesc());
        }
        mongoTemplate.insert(novelTpye, Tables.EMongoTable.novelType.tableName);
    }

    /**
     * 更新小说类型
     * @param novelTpye
     * @return
     * @throws Exception
     */
    public boolean updateNovelType(NovelType novelTpye) throws Exception{
        List<NovelType> dataList = this.getTypeByName(novelTpye.getTypeName());
        if(!CollectionUtils.isEmpty(dataList) && !dataList.get(0).getId().equals(novelTpye.getId())){
            throw new BaseException(MONGO_NOVELTYPE_DUPLICATE.getCodeStr(), MONGO_NOVELTYPE_DUPLICATE.getDesc());
        }
        return mongoTemplateUtil.updateCommon(novelTpye, NovelType.class, Tables.EMongoTable.novelType.tableName);
    }

    /**
     * 通过类型名称查找类型
     * @param typeName
     * @return
     */
    public List<NovelType> getTypeByName(String typeName){
        Query query=new Query();
        if(!StringUtils.isEmpty(typeName)){
            query.addCriteria(Criteria.where("typeName").is(typeName));
        }
        query.addCriteria(Criteria.where("isDeleted").is(0));
        List<NovelType> dataList = mongoTemplate.find(query, NovelType.class, Tables.EMongoTable.novelType.tableName);
        return dataList;
    }


}
