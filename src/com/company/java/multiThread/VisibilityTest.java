package com.company.java.multiThread;

/**
 * Created by wtwang on 2019/5/20.
 */
public class VisibilityTest {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread{
        public void run(){
            int count = 0;
            while (!ready) {
                Thread.yield();
                count++;
            }
            System.out.println(count);
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
