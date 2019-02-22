package com.wenzhi.novel.mongo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ApiModel(value = "NovelType")
@Document(collection = "NovelType")
@Data
public class NovelType extends BaseMongoModel{
    @ApiModelProperty("分类名称")
    private String typeName;
    @ApiModelProperty("分类描述")
    private String typeDesc;
    @ApiModelProperty("分类logo图")
    private String typeImage;
    @ApiModelProperty("权重号(越小越前)")
    private Integer sequence;
    @ApiModelProperty("分类状态(1 显示  2 不显示)")
    private Integer typeStatus;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("是否删除(1 是  0 否)")
    private Integer isDeleted;
}
