package com.company.java.grammar;

import java.util.StringTokenizer;

/**StrinTokenizer测试，类似于split，切割字符串
 * Created by kriswong on 2019/5/8.
 */
public class StringTokenizerTest {
    public static void main(String[] args){
        String s = "I have a dream";
        StringTokenizer tokenizer = new StringTokenizer(s," ");
        StringBuilder sb = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            sb.append(tokenizer.nextToken());
        }
        System.out.println(sb.toString());
    }
}
