package com.wenzhi.novel.mongo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Date;

@ApiModel(value = "NovelList")
@Document(collection = "NovelList")
@Data
public class NovelList extends BaseMongoModel{
    @ApiModelProperty("小说名字")
    private String novelName;
    @ApiModelProperty("小说描述")
    private String novelDesc;
    @ApiModelProperty("小说作者")
    private String novelAuthor;
    @ApiModelProperty("小说封面图片url")
    private String novelImage;
    @ApiModelProperty("小说状态(0 敬请期待  1 连载中  2 完本)")
    private Integer novelStatus;
    @ApiModelProperty("小说分类数组")
    private Integer[] type;
    @ApiModelProperty("小说分类排序序号(分类+.+序号)")
    private Double[] typeSequence;
    @ApiModelProperty("全局小说排序序号")
    private Integer sequence;
    @ApiModelProperty("是否展示(1 是  0 否)")
    private Integer isShow;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("是否删除(1 是  0 否)")
    private Integer isDeleted;
}
