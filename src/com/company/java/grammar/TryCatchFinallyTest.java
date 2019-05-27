package com.company.java.grammar;

/**
 * 测试try-catch-finally中的返回
 * 1.finally中的return语句会覆盖try和catch中的return语句
 * 2.finally中的非return语句会在try和catch中的return语句之后执行
 * Created by wtwang on 2019/5/27.
 */
public class TryCatchFinallyTest {
    public static void main(String[] args){
        System.out.println(testMethod());
    }
    public static int testMethod(){
        int ret = 1;
        try{
            int a = 1/0;
            return ret;
        }catch (Exception e){
            ret++;
            return ret;
        }finally {
            ret++;
//            return ret;
        }
    }
}
