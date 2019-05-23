package com.company.java.multiThread;

import java.util.Scanner;

/**线程测试
 * Created by kriswong on 2019/4/22.
 */
public class MyThread extends Thread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        MyThread t = new MyThread();
        MyThread s = new MyThread();
        t.run();
        System.out.println("111");
        s.run();
        System.out.println("222");
    }

    public void run(){
        System.out.println("Thread");
    }
}
