package com.wenzhi.novel.mongo.util;

import com.mongodb.client.result.UpdateResult;
import com.wenzhi.novel.mongo.model.BaseMongoModel;
import com.wenzhi.novel.util.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

import static com.wenzhi.novel.hardcode.EExceptionCode.EErrorCode.MONGO_UPDATE_ERROR;
import static com.wenzhi.novel.hardcode.EExceptionCode.EErrorCode.MONGO_UPDATE_NOTDATA;

@Component
public class MongoTemplateUtil{

    @Autowired
    private MongoTemplate mongoTemplate;

    public <T> boolean updateCommon(BaseMongoModel baseMongoModel, Class<T> modelClass, String tableName) throws Exception{
        T oldObject = mongoTemplate.findById(baseMongoModel.getId(), modelClass, tableName);
        T newObject = (T)baseMongoModel;
        if(oldObject == null){
            throw new BaseException(MONGO_UPDATE_NOTDATA.getCodeStr(), MONGO_UPDATE_NOTDATA.getDesc());
        }
        Update update = new Update();
        boolean check = false;
        Field[] fields = newObject.getClass().getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            if(field.get(newObject)!=null && !field.get(oldObject).equals(field.get(newObject))){
                check = true;
                update.set(field.getName(), field.get(newObject));
            }
        }
        if (check) {
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(baseMongoModel.getId()));
            UpdateResult updateResult = this.mongoTemplate.updateMulti(query, update, tableName);
            if (updateResult.getModifiedCount() <= 0) {
                throw new BaseException(MONGO_UPDATE_ERROR.getCodeStr(), MONGO_UPDATE_ERROR.getDesc());
            }
        }
        return true;
    }
}
