package com.wenzhi.novel.entity.response;

import com.wenzhi.novel.mongo.model.NovelContent;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NovelContentResponse {
    @ApiModelProperty("小说id")
    private String novelId;
    @ApiModelProperty("小说章节号")
    private Integer titleId;
    @ApiModelProperty("小说章节标题")
    private String title;
    @ApiModelProperty("小说章节下内容")
    private String content;

    public static NovelContentResponse getResByNovelContent(NovelContent novelContent){
        NovelContentResponse response = new NovelContentResponse();
        response.setNovelId(novelContent.getId());
        response.setTitleId(novelContent.getTitleId());
        response.setTitle(novelContent.getTitle());
        response.setContent(novelContent.getContent());
        return response;
    }
}
