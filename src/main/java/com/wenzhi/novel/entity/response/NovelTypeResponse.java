package com.wenzhi.novel.entity.response;

import com.wenzhi.novel.mongo.model.NovelType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NovelTypeResponse {
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

    public static NovelTypeResponse getResByNovelType(NovelType novelType){
        NovelTypeResponse response = new NovelTypeResponse();
        response.setId(novelType.getId());
        response.setTypeName(novelType.getTypeName());
        response.setTypeDesc(novelType.getTypeDesc());
        response.setTypeImage(novelType.getTypeImage());
        response.setSequence(novelType.getSequence());
        response.setTypeStatus(novelType.getTypeStatus());
        return response;
    }
}
