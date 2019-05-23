package com.company.java.grammar;

import java.io.UnsupportedEncodingException;

/**字符串编码测试
 * Created by kriswong on 2019/5/8.
 */
public class EncodeTest {
    public static void main(String[] args){
        String s = "测试句子";
        byte[] bt = s.getBytes();
        try {
            String s2 = new String(bt,"GBK");
            String s3 = new String(bt,"UTF-8");
            System.out.println(s2);
            System.out.println(s3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
