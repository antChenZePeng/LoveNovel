package com.wenzhi.novel.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 分页参数
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Pagination {

    public static final int PAGENO = 1;
    public static final int PAGESIZE = 10;

    private Integer pageNo;
    private Integer pageSize;
    private Integer count;

    public Pagination() {
        this.pageNo = PAGENO;
        this.pageSize = PAGESIZE;
        this.count = 0;
    }

    public Pagination(Integer pageNo, Integer pageSize, Integer count) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.count = count;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
