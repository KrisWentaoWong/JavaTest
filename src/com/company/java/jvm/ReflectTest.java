package com.company.java.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by kriswong on 2019/5/9.
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        test2();

    }

    /**
     * 根据类名获取类中的所有方法和属性
     */
    public static void test1(){
        Class c = String.class;
        Method[] methods = c.getMethods();
        for(int i=0;i<methods.length;++i){
            System.out.println(methods[i].getName());
        }

        Field[] fields = c.getFields();
        for(Field f:fields){
            System.out.println(f.getType()+":"+f.getName());
        }
    }

    public static void test2() throws Exception {
//        Class c = Class.forName("java.lang.String");
        Class c = String.class;
        String s = (String)c.newInstance();
        s += "a";
        System.out.println(s);
    }
}
