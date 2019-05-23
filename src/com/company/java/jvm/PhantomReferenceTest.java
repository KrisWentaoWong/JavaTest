package com.company.java.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * Created by kriswong on 2019/5/8.
 */
public class PhantomReferenceTest {
    public static void main(String[] agrs){
        ReferenceQueue<String> rq = new ReferenceQueue<>();
        PhantomReference<String> pr = new PhantomReference<>("hello",rq);
        System.out.println(pr.get());
        //通知JVM进行垃圾回收
        System.gc();
        System.out.println(pr.get());
    }
}
