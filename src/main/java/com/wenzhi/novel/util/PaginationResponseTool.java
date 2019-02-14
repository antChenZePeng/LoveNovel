package com.wenzhi.novel.util;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 分页响应工具
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationResponseTool<T> extends ResponseTool<T> {

    private Pagination pagination;

    public PaginationResponseTool(String state, T data, Pagination pagination,double total) {
        super(state, data);
        this.pagination = pagination;
    }

    public PaginationResponseTool(String state, String message) {
        super(state, message);
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
