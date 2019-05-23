package com.company.java.jvm;

import java.lang.ref.WeakReference;

/**
 * Created by kriswong on 2019/5/8.
 */
public class WeakReferenceTest {
    public static void main(String[] agrs){
        WeakReference<String> wr = new WeakReference<String>(new String("hello"));
        WeakReference<String> wr2 = new WeakReference<String>("hello");
        System.out.println(wr.get());
        System.out.println(wr2.get());
        //通知JVM进行垃圾回收
        System.gc();
        System.out.println(wr.get());
        System.out.println(wr2.get());
    }
}
