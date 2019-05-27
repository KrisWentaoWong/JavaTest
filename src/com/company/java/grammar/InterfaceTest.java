package com.company.java.grammar;

/**
 * 接口中的方法测试
 * 1.接口中方法的默认修饰符是public abstract，抽象方法中没有方法体，没有大括号；
 * 2.JDK1.8中，接口中的方法可以被default修饰，但被修饰的方法必须有方法体；
 * Created by kriswong on 2019/4/29.
 */
public interface InterfaceTest {
    void test();

    static void test2() {
    }
}
