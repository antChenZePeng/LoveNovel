package com.wenzhi.novel.hardcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tables {
    /** mongo数据表 **/
    public enum EMongoTable {
        novelList(1, "novelList"), // 小说列表
        novelType(2, "novelType"), //小说分类列表
        novelContent(3, "novelContent"), //小说内容
        novelTag(4, "novelTag"),//小说标签列表
        ;

        public final Integer tableId;
        public final String tableName;

        EMongoTable(Integer tableId, String tableName) {
            this.tableId = tableId;
            this.tableName = tableName;
        }
    }
}
