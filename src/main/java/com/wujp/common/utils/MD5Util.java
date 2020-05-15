package com.wujp.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;


public class MD5Util {

    public final static String calc(String ss) {
        String s = ss == null ? "" : ss;
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        String strValue = "";
        try {
            byte[] strTemp = s.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            strValue = StringUtils.lowerCase(new String(str));//全部转换成小写
            return strValue;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.print(MD5Util.calc("printuniusre"));
    }
}
