package com.wenzhi.novel.entity.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NovelTypeRequest extends BaseRequest{
    @ApiModelProperty("分类id")
    private String id;
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
    @ApiModelProperty("是否删除(1 是  0 否)")
    private Integer isDeleted;
}
