package com.company.java.other;

/**
 * Created by wtwang on 2019/5/23.
 */
public class BitTest {
    public static void main(String[] args){
        int a = 1111111221;
        System.out.println((int)(double)a == a);
        //将int转换为float会丢失精度，因为float是 1 8 23，double是 1 11 52
        System.out.println((int)(float)a == a);
        //将2/3.0转换为double再转换为float和自身相等说明没有精度丢失，说明2/3.0默认是float
        System.out.println((float)(double)2/3.0 == 2/3.0);
    }
}
