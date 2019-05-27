package com.company.java.network;

import java.io.UnsupportedEncodingException;

/**
 * 字符串编码解码测试
 * Created by wtwang on 2019/5/27.
 */
public class StringEncodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] src = {'1','2'},dst;
        dst = new String(src,"GBK").getBytes("UTF-8");
        System.out.println(dst);
    }
}
