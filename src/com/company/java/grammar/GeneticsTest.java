package com.company.java.grammar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**泛型测试
 * Created by kriswong on 2019/4/25.
 */
public class GeneticsTest {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
    }

//    public static int method1(List<Integer> list){
//        System.out.println("Integer");
//        return 1;
//    }

    public static void method1(List<String> list){
        System.out.println("Integer");
    }
}
