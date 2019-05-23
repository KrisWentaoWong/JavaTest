package com.company.java.multiThread;

/**
 * synchronized关键字测试
 * Created by wtwang on 2019/5/20.
 */
public class SynchronizedTest {
    public Integer a = 0;
    public void testMethod(){
        /**
         * synchronized可以获取一个对象的锁，如果定义为int a则无法获取锁
         */
        synchronized (a){
            a++;
        }
    }
}
