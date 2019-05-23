package com.company.java.other;

/**
 * JavaDoc测试
 * Created by kriswong on 2019/5/6.
 */
public class JavaDocTest {
    private int a;
    private int b;

    /**
     * testMethod1
     * 给a、b赋值
     */
    public void testMethod1(){
        a=1;
        b=2;
    }
    //单行注释测试
    /*
    多行注释测试
     */

    public static void main(String[] agrs){
        System.out.println("Java Doc test program!");
    }
}
