package com.wenzhi.novel.mongo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class BaseMongoModel {
    @Id
    private String id;
}
