package com.wenzhi.novel.mongo.util;

import com.mongodb.client.result.UpdateResult;
import com.wenzhi.novel.mongo.model.BaseMongoModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.lang.reflect.Field;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

public class MongoUtil {

    /**
     * 定义自增键
     * @param mongoTemplate
     * @param collectionName
     * @return
     */
    public static Integer getNextSequence(MongoTemplate mongoTemplate,String collectionName) {
        MongoSequence seq = mongoTemplate.findAndModify(
                query(where("_id").is(collectionName)),
                new Update().inc("seq", 1),
                options().upsert(true).returnNew(true),
                MongoSequence.class);
        return seq.getSeq();
    }

    public class MongoSequence {
        @Id
        private String id;
        private int seq;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }
    }
}
