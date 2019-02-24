package com.wenzhi.novel.mongo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ApiModel(value = "NovelContent")
@Document(collection = "NovelContent")
@Data
public class NovelContent extends BaseMongoModel{
    @ApiModelProperty("小说id")
    private String novelId;
    @ApiModelProperty("小说章节号")
    private Integer titleId;
    @ApiModelProperty("小说章节标题")
    private String title;
    @ApiModelProperty("小说章节下内容")
    private String content;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("是否删除(1 是  0 否)")
    private Integer isDeleted;
}
