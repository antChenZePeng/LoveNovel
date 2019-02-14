package com.wenzhi.novel.entity.baseentity;

import lombok.Data;

@Data
public class MysqlBase {
    private String id;
    private String tableName;
    private String executeType;
}
