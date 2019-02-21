package com.wenzhi.novel.util;

import org.apache.commons.lang.StringUtils;

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

    public static boolean upload(String logoType, String fileId, byte[] content) {
        OutputStream outStream = null;
        BufferedOutputStream bos = null;
        try {
            if (content != null && content.length > 0) {
                String filePath = StringUtils.isEmpty(logoType)? "/data/app/images/" + fileId : "/data/app/images/" + logoType + "/" + fileId;
                outStream = new FileOutputStream(new File(filePath));
                bos = new BufferedOutputStream(outStream);
                bos.write(content, 0, content.length);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null){
                    bos.flush();
                    bos.close();
                }
                if (outStream != null) {
                    outStream.flush();
                    outStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
}
