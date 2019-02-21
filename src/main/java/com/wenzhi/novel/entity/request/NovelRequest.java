package com.wenzhi.novel.entity.request;

import lombok.Data;

@Data
public class NovelRequest extends BaseRequest{
    private String id;
    private String novelName;
    private String novelDesc;
    private String novelAuthor;
    private String novelImage;
    private Integer novelStatus;
    private Integer isShow;
    private String types;
    private Integer sequence;
    private Integer type;
    private Integer isDeleted;
}
