package com.company.java.grammar;

/**内部类测试
 * Created by kriswong on 2019/4/28.
 */
public class InnerClassTest {
    public static void main(String[] args){
        System.out.println("main");
    }
    InnerClassTest(){
        System.out.println("this is class InnerClassTest");
    }

    public void test(){
        class B{
            B(){

            }
        }
    }
}
