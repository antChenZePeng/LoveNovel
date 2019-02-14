package com.wenzhi.novel.util;

import java.util.Vector;

public class HttpRespons {
    protected String urlString;
    protected int defaultPort;
    protected String file;
    protected String host;
    protected String path;
    protected int port;
    protected String protocol;
    protected String query;
    protected String ref;
    protected String userInfo;
    protected String contentEncoding;
    protected String content;
    protected String contentType;
    protected int code;
    protected String message;
    protected String method;
    protected int connectTimeout;
    protected int readTimeout;
    protected Vector<String> contentCollection;

    public HttpRespons() {
    }

    public String getContent() {
        return this.content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Vector<String> getContentCollection() {
        return this.contentCollection;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public String getMethod() {
        return this.method;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getUrlString() {
        return this.urlString;
    }

    public int getDefaultPort() {
        return this.defaultPort;
    }

    public String getFile() {
        return this.file;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRef() {
        return this.ref;
    }

    public String getUserInfo() {
        return this.userInfo;
    }
}