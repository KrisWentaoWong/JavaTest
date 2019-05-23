package com.company.java.other;

/**
 * String类测试
 * Created by wtwang on 2019/5/20.
 */
public class StringTest {
    public static void main(String[] args){
//        String s = "a";
//        System.out.println(s);
//        System.out.println(s.hashCode());
//        String s2 = "b";
//        System.out.println(s2);
//        System.out.println(s2.hashCode());
//        s = s2;
//        System.out.println(s);
//        System.out.println(s.hashCode());


        final StringBuilder sb = new StringBuilder("a");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.append("b");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        /**
         * 引用不可变，但是指向的对象是可以改变的
         * String是final修饰的引用类型，不可被继承，指向的字符串引用不可变，但可以改变字符串的值
         */
        final int[] test = {1,2,3};
        test[2] = 4;
        for (int a:test
             ) {
            System.out.println(a);
        }

    }
}
