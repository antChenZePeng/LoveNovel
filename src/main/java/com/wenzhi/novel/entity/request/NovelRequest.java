package com.wenzhi.novel.entity.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NovelRequest extends BaseRequest{
    private String id;
    @ApiModelProperty("小说名字--editNovel.do,checkNovelName.do")
    private String novelName;
    @ApiModelProperty("小说描述--editNovel.do")
    private String novelDesc;
    @ApiModelProperty("小说作者--editNovel.do")
    private String novelAuthor;
    @ApiModelProperty("小说封面图片url--editNovel.do")
    private String novelImage;
    @ApiModelProperty("小说状态(0 敬请期待  1 连载中  2 完本)--editNovel.do")
    private Integer novelStatus;
    @ApiModelProperty("是否展示(1 是  0 否)--editNovel.do")
    private Integer isShow;
    @ApiModelProperty("小说分类(多个以逗号隔开)--editNovel.do")
    private String types;
    @ApiModelProperty("全局小说排序序号--editNovel.do")
    private Integer sequence;
    @ApiModelProperty("小说分类--findNovelByType.do")
    private Integer type;
    @ApiModelProperty("是否删除(1 是  0 否)--editNovel.do")
    private Integer isDeleted;
}
