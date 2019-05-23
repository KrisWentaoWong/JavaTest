package com.company.java.multiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wtwang on 2019/5/22.
 */
public class ExecutorTest {
    private static final int NTHREADS = 10;
    private static int i=0;
    private static final ExecutorService exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args){
        for(int j=0;j<1000;++j){
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    increaseI();
                }
            };
            exec.execute(task);
//            new Thread(task).start();
        }
        exec.shutdown();
        System.out.println(i);
    }

    public synchronized static void increaseI(){
        i++;
    }

}

class MyExecutor implements Executor{
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
