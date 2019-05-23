package com.company.java.multiThread;

/**线程测试
 * Created by kriswong on 2019/5/6.
 */
public class ThreadTest extends Thread{
    public void run() {
        int count = 0;
        while(!this.isInterrupted()){
            System.out.println(count+" "+this.isAlive());
            count++;
            if(count==5){
                this.interrupt();
                System.out.println(count+" "+this.isAlive());
            }
        }
        System.out.println(count+" "+this.isAlive());
    }


    public static void main(String[] args){
        ThreadTest thread1 = new ThreadTest();


        thread1.start();
    }
}
