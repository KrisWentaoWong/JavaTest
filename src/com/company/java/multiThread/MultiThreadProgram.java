package com.company.java.multiThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kriswong on 2019/5/8.
 */
public class MultiThreadProgram implements Runnable {
    int num;
    static HashMap<Integer,Integer> map = new HashMap<>();
    @Override
    public void  run() {
        //无冲突多线程更改，不需要加锁
//        for (int i = num * 10; i < (num + 1) * 10; ++i) {
//            map.put(i,map.get(i)*2);
//        }
        //有冲突多线程更改
        for (int i = 0; i < 400; ++i) {
            map.put(i+1,map.get(i+1)*2);
        }

    }

    public static void main(String[] args){
        int threadNum = 4;
        for(int i=0;i<400;++i){
            map.put(i+1,i+1);
        }
        for(int i=0;i<threadNum;++i) {
            MultiThreadProgram threadProgram = new MultiThreadProgram();
            threadProgram.num = i;
            Thread thread = new Thread(threadProgram);
            thread.start();
        }
        boolean flag = true;
        for(Map.Entry entry:map.entrySet()){
            if((Integer)entry.getValue()/(Integer)entry.getKey() != 16){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
