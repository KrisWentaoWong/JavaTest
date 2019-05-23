package com.company.java.grammar;

/**静态代码块，构造代码块、构造函数测试
 * Created by kriswong on 2019/3/6.
 */
public class ClassTest {
    public ClassTest(){//构造函数
        System.out.println("构造函数");
    }
    {//构造代码块
        System.out.println("构造代码块");
    }
    static {//静态代码块
        System.out.println("静态代码块");
    }
    static int a;
    public static void main(String[] args){
//        ClassTest ct = new ClassTest();
//        ClassTest ct2 = new ClassTest();
//        B b = new B();


        System.out.println(a);
//        StringBuilder sb = new StringBuilder("123");
//        Class c = sb.getClass();
//        System.out.println(c.isInstance(sb));
    }


}

class B extends ClassTest{
    public B(){//构造函数
        System.out.println("B构造函数");
    }
    {//构造代码块
        System.out.println("B构造代码块");
    }
    static {//静态代码块
        System.out.println("B静态代码块");
    }
}


