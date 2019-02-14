package com.wenzhi.novel.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class HttpRequester {
    private String defaultContentEncoding = Charset.defaultCharset().name();

    public HttpRequester() {
    }

    public HttpRespons sendGet(String urlString) throws IOException {
        return this.send(urlString, "GET", (Map) null, (Map) null);
    }

    public HttpRespons sendGet(String urlString, Map<String, String> params) throws IOException {
        return this.send(urlString, "GET", params, (Map) null);
    }

    public HttpRespons sendGet(String urlString, Map<String, String> params, Map<String, String> propertys) throws IOException {
        return this.send(urlString, "GET", params, propertys);
    }

    public HttpRespons sendPost(String urlString) throws IOException {
        return this.send(urlString, "POST", (Map) null, (Map) null);
    }

    public HttpRespons sendPost(String urlString, Map<String, String> params) throws IOException {
        return this.send(urlString, "POST", params, (Map) null);
    }

    public HttpRespons sendPost(String urlString, Map<String, String> params, Map<String, String> propertys) throws IOException {
        return this.send(urlString, "POST", params, propertys);
    }

    private HttpRespons send(String urlString, String method, Map<String, String> parameters, Map<String, String> propertys) throws IOException {
        HttpURLConnection urlConnection = null;
        Entry entry;
        Iterator var9;
        String key;
        String value;
        if (method.equalsIgnoreCase("GET") && parameters != null) {
            StringBuffer param = new StringBuffer();
            int i = 0;

            for (var9 = parameters.entrySet().iterator(); var9.hasNext(); ++i) {
                entry = (Entry) var9.next();
                key = (String) entry.getKey();
                value = (String) entry.getValue();
                if (i == 0) {
                    param.append("?");
                } else {
                    param.append("&");
                }

                param.append(key);
                param.append("=");
                param.append(value);
            }

            urlString = urlString + param;
        }

        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod(method);
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setUseCaches(false);
        if (propertys != null) {
            Iterator var15 = propertys.entrySet().iterator();

            while (var15.hasNext()) {
                entry = (Entry) var15.next();
                key = (String) entry.getKey();
                key = (String) entry.getValue();
                urlConnection.addRequestProperty(key, key);
            }
        }

        if (method.equalsIgnoreCase("POST") && parameters != null) {
            StringBuffer param = new StringBuffer();
            var9 = parameters.entrySet().iterator();

            while (var9.hasNext()) {
                entry = (Entry) var9.next();
                key = (String) entry.getKey();
                value = (String) entry.getValue();
                param.append("&");
                param.append(key);
                param.append("=");
                param.append(value);
            }

            urlConnection.getOutputStream().write(param.toString().getBytes());
            urlConnection.getOutputStream().flush();
            urlConnection.getOutputStream().close();
        }

        return this.makeContent(urlString, urlConnection);
    }

    public HttpRespons sendPost(String urlString, String postStr, Map<String, String> propertys) throws IOException {
        HttpURLConnection urlConnection = null;
        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setUseCaches(false);
        if (propertys != null) {
            Iterator var7 = propertys.entrySet().iterator();

            while (var7.hasNext()) {
                Entry<String, String> entry = (Entry) var7.next();
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();
                urlConnection.addRequestProperty(key, value);
            }
        }

        urlConnection.getOutputStream().write(postStr.getBytes());
        urlConnection.getOutputStream().flush();
        urlConnection.getOutputStream().close();
        return this.makeContent(urlString, urlConnection);
    }

    public HttpRespons sendPostJson(String urlString, String jsonStr) throws IOException {
        HttpURLConnection urlConnection = null;
        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setUseCaches(false);
        byte[] data = jsonStr.toString().getBytes();
        urlConnection.setRequestProperty("Content-Length", String.valueOf(data.length));
        urlConnection.setRequestProperty("contentType", "application/json");
        urlConnection.getOutputStream().write(data);
        urlConnection.getOutputStream().flush();
        urlConnection.getOutputStream().close();
        return this.makeContent(urlString, urlConnection);
    }

    private HttpRespons makeContent(String urlString, HttpURLConnection urlConnection) throws IOException {
        HttpRespons httpResponser = new HttpRespons();

        try {
            InputStream in = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            httpResponser.contentCollection = new Vector();
            StringBuffer temp = new StringBuffer();

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                httpResponser.contentCollection.add(line);
                temp.append(line).append("\r\n");
            }

            bufferedReader.close();
            String ecod = urlConnection.getContentEncoding();
            if (ecod == null) {
                ecod = this.defaultContentEncoding;
            }

            httpResponser.urlString = urlString;
            httpResponser.defaultPort = urlConnection.getURL().getDefaultPort();
            httpResponser.file = urlConnection.getURL().getFile();
            httpResponser.host = urlConnection.getURL().getHost();
            httpResponser.path = urlConnection.getURL().getPath();
            httpResponser.port = urlConnection.getURL().getPort();
            httpResponser.protocol = urlConnection.getURL().getProtocol();
            httpResponser.query = urlConnection.getURL().getQuery();
            httpResponser.ref = urlConnection.getURL().getRef();
            httpResponser.userInfo = urlConnection.getURL().getUserInfo();
            httpResponser.content = new String(temp.toString().getBytes(), ecod);
            httpResponser.contentEncoding = ecod;
            httpResponser.code = urlConnection.getResponseCode();
            httpResponser.message = urlConnection.getResponseMessage();
            httpResponser.contentType = urlConnection.getContentType();
            httpResponser.method = urlConnection.getRequestMethod();
            httpResponser.connectTimeout = urlConnection.getConnectTimeout();
            httpResponser.readTimeout = urlConnection.getReadTimeout();
            HttpRespons var10 = httpResponser;
            return var10;
        } catch (IOException var13) {
            throw var13;
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

        }
    }

    public String getDefaultContentEncoding() {
        return this.defaultContentEncoding;
    }

    public void setDefaultContentEncoding(String defaultContentEncoding) {
        this.defaultContentEncoding = defaultContentEncoding;
    }
}