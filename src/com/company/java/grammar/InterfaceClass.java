package com.company.java.grammar;

/**
 * Created by kriswong on 2019/4/29.
 */
public class InterfaceClass implements InterfaceTest {
    public static void main(String[] args){
        InterfaceTest ins = new InterfaceClass();
        ins.test();
    }

    public void test(){
        System.out.println("test");
    }
}
