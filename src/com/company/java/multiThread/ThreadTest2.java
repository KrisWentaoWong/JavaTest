package com.company.java.multiThread;

/**
 * 线程的启动需要调用start方法，否则只是调用了一个run函数
 * Created by wtwang on 2019/5/22.
 */
public class ThreadTest2 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("run");
    }

    public static void main(String[] args){
        ThreadTest2 example= new ThreadTest2();
        example.run();
        System.out.print("main");

    }
}
