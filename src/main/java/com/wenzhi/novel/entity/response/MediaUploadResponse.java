package com.wenzhi.novel.entity.response;

import com.wenzhi.novel.mysql.model.PG_MediaStorage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

@Data
@ApiModel(value ="多媒体上传返回视图", description = "多媒体上传返回视图")
public class MediaUploadResponse {
    @ApiModelProperty("记录id")
    private Integer id;
    @ApiModelProperty("访问url")
    private String mediaUrl;

    public static MediaUploadResponse getBasieResponse(PG_MediaStorage mediaStorage){
        MediaUploadResponse response = new MediaUploadResponse();
        response.setId(mediaStorage.getId());
        String mediaUrl = StringUtils.isEmpty(mediaStorage.getDirpath())?
                mediaStorage.getDomainpath()+"/" + mediaStorage.getMedianame() :
                mediaStorage.getDomainpath()+"/" + mediaStorage.getDirpath()+"/" + mediaStorage.getMedianame();
        response.setMediaUrl(mediaUrl);
        return response;
    }
}
