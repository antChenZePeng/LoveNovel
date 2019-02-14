package com.wenzhi.novel.entity.baseentity;

import lombok.Data;

@Data
public class EssqlBase {
    private Integer id;
    private String tableName;
    private String indexName;
    private String typeName;
    private String executeType;
}
