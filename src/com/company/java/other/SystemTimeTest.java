package com.company.java.other;

/**系统时间测试
 * Created by kriswong on 2019/5/8.
 */
public class SystemTimeTest {
    public static void main(String[] args){
        long startTime1 = System.currentTimeMillis();
        long startTime2 = System.nanoTime();
        for(int i=0;i<1000000;++i){
            System.out.println(i);
        }
        long endTime1 = System.currentTimeMillis();
        long endTime2 = System.nanoTime();
        System.out.println(endTime1-startTime1);
        System.out.println(endTime2-startTime2);
    }
}
