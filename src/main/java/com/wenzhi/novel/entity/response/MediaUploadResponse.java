package com.wenzhi.novel.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value ="多媒体上传返回视图", description = "多媒体上传返回视图")
public class MediaUploadResponse {
    @ApiModelProperty("记录id")
    private Integer id;
    @ApiModelProperty("访问url")
    private String mediaUrl;
}
