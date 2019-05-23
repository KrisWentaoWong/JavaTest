package com.company.java.jvm;

import java.lang.ref.SoftReference;

/**
 * Created by kriswong on 2019/5/8.
 */
public class SoftReferenceTest {
    public static void main(String[] agrs){
        SoftReference<String> sr = new SoftReference<String>(new String("hello"));
        System.out.println(sr.get());
        //通知JVM进行垃圾回收
        System.gc();
        System.out.println(sr.get());
    }
}
