package com.wenzhi.novel.entity.response;

import com.wenzhi.novel.mongo.model.NovelList;
import lombok.Data;

@Data
public class NovelResponse {
    private String id;
    private String novelName;
    private String novelDesc;
    private String novelAuthor;
    private String novelImage;
    private Integer type;
    private String typeName;
    private Double typeSequence;
    private Integer sequence;

    public static NovelResponse getResByNovelList(NovelList novel, Integer type){
        NovelResponse response = new NovelResponse();
        response.setId(novel.getId());
        response.setNovelName(novel.getNovelName());
        response.setNovelDesc(novel.getNovelDesc());
        response.setNovelAuthor(novel.getNovelAuthor());
        response.setNovelImage(novel.getNovelImage());
        if(type!=null){
            response.setType(type);
            response.setTypeName("");
            response.setTypeSequence(0.0);
            for(Double typeSequence : novel.getTypeSequence()){
                if(typeSequence>=type && typeSequence<type+1){
                    response.setTypeSequence(typeSequence);
                }
            }
        }
        response.setSequence(novel.getSequence());
        return response;
    }
}
