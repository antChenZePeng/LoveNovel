package com.wenzhi.novel.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public MD5Util() {
    }

    public static String digest(byte[] content) {
        if (content != null && content.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(content);
                return toHex(messageDigest.digest());
            } catch (NoSuchAlgorithmException var3) {
                var3.printStackTrace();
                return "";
            }
        } else {
            return null;
        }
    }

    public static String digest16(String str) {
        return str != null && str.length() != 0 ? digest(str.getBytes()).substring(8, 24) : str;
    }

    public static String digest(String str) {
        return str != null && str.length() != 0 ? digest(str.getBytes()) : str;
    }

    private static String toHex(byte[] buffer) {
        StringBuffer sb = new StringBuffer(buffer.length * 2);

        for(int i = 0; i < buffer.length; ++i) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }

        return sb.toString();
    }
}
