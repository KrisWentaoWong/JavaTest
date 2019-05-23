package com.company.java.grammar;

import java.util.ArrayList;
import java.util.List;

/**ArrayList泛型测试
 * Created by kriswong on 2019/4/24.
 */
public class ArrayListTest {
    public static void main(String[] args){
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
        }
    }
}
