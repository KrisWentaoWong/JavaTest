package com.company.java.multiThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类测试
 * Created by kriswong on 2018/11/30.
 */
public class AtomicTest {
    public static AtomicInteger race = new AtomicInteger(0);

    public static void increase(){
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args){
        Thread[] threads = new Thread[THREADS_COUNT];
        for(int i=0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<1000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while(Thread.activeCount() > 1){
            Thread.yield();
        }

        System.out.println(race);
    }
}
