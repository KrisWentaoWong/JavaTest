package com.company.java.grammar;

/**Switch测试
 * Created by kriswong on 2019/4/26.
 */
public class SwitchTest {
    public static void main(String[] args){
        String s = "aa";
        switch (s){
            case "a":
                System.out.println(1);
                break;
            case "aa":
                System.out.println(2);
                break;
            default:
                break;
        }
//        char a = 'a';
//        switch (a){
//            case 'a':
//                System.out.println(1);
//                break;
//            case 'b':
//                System.out.println(2);
//                break;
//            default:
//                break;
//        }
    }
}
