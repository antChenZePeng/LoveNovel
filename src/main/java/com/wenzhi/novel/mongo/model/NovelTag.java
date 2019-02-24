package com.wenzhi.novel.mongo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ApiModel(value = "NovelTag")
@Document(collection = "NovelTag")
@Data
public class NovelTag extends BaseMongoModel{
    @ApiModelProperty("标签id")
    private Integer tagId;
    @ApiModelProperty("标签名称")
    private String tagName;
    @ApiModelProperty("标签描述")
    private String tagDesc;
    @ApiModelProperty("权重号(越小越前)")
    private Integer sequence;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("是否删除(1 是  0 否)")
    private Integer isDeleted;
}
