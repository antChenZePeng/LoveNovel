package com.wenzhi.novel.util;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UploadUtils {
    public UploadUtils() {
    }

    public static boolean upload(String uploadUrl, String logoType, String fileId, byte[] content) {
        OutputStream outStream = null;

        try {
            if (content != null && content.length > 0) {
                uploadUrl = uploadUrl + "?logoType=" + logoType + "&fileId=" + URLEncoder.encode(fileId, "UTF-8");
                URL realUrl = new URL(uploadUrl);
                URLConnection conn = realUrl.openConnection();
                conn.setDoOutput(true);
                conn.setDoInput(true);
                outStream = conn.getOutputStream();
                outStream.write(content);
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                boolean var9 = true;

                int i;
                while((i = in.read()) != -1) {
                    result.write(i);
                }

                boolean var11 = "0".equals(result.toString());
                return var11;
            }

            return false;
        } catch (Exception var20) {
            var20.printStackTrace();
        } finally {
            try {
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException var19) {
                var19.printStackTrace();
            }

        }

        return false;
    }

    public static boolean upload(String uploadUrl, Map<String, String> queryParams, Map<String, String> headers, byte[] content) {
        OutputStream outStream = null;

        try {
            if (content == null || content.length <= 0) {
                return false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(uploadUrl).append("?");
                Iterator var7 = queryParams.entrySet().iterator();

                while(var7.hasNext()) {
                    Map.Entry<String, String> e = (Map.Entry)var7.next();
                    sb.append((String)e.getKey()).append("=").append(URLEncoder.encode((String)e.getValue(), "UTF-8")).append("&");
                }

                sb.deleteCharAt(sb.lastIndexOf("&"));
                uploadUrl = sb.toString();
                URL realUrl = new URL(uploadUrl);
                URLConnection conn = realUrl.openConnection();
                conn.setDoOutput(true);
                conn.setDoInput(true);
                conn.setConnectTimeout(2000);
                conn.setReadTimeout(3600000);
                Iterator var9 = headers.entrySet().iterator();

                while(var9.hasNext()) {
                    Map.Entry<String, String> e = (Map.Entry)var9.next();
                    conn.setRequestProperty((String)e.getKey(), (String)e.getValue());
                }

                outStream = conn.getOutputStream();
                outStream.write(content);
                conn.connect();
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                ByteArrayOutputStream result = new ByteArrayOutputStream();
                boolean var11 = true;

                int i;
                while((i = in.read()) != -1) {
                    result.write(i);
                }

                String rst = result.toString();
                in.close();
                result.close();
                boolean var13 = "0".equals(rst);
                return var13;
            }
        } catch (Exception var22) {
            var22.printStackTrace();
            return false;
        } finally {
            try {
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException var21) {
                var21.printStackTrace();
            }

        }
    }

    public static boolean delres(String delResUrl, String logoType, String fileId) {
        try {
            HttpRequester request = new HttpRequester();
            Map<String, String> params = new HashMap(2);
            params.put("logoType", logoType);
            params.put("fileId", fileId);
            HttpRespons response = request.sendGet(delResUrl, params);
            String resp = response.getContent();
            return "0".equals(resp.toString());
        } catch (Exception var7) {
            var7.printStackTrace();
            return false;
        }
    }
}
