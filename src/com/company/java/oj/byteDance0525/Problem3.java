package com.company.java.oj.byteDance0525;

import java.util.Scanner;
import java.util.Stack;

/**
 * 输入字符串，将%和#之间的字符重复n倍，n为%之前的数字
 * Created by wtwang on 2019/5/25.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.next();
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();++i){
                //非#字符都入栈
                if(s.charAt(i) != '#'){
                    stack.push(s.charAt(i));
                }else{
                    //#字符，则将栈中元素出栈，知道遇到%
                    String temp = "";
                    while(stack.peek() != '%'){
                        temp = stack.pop() + temp;
                    }
                    //将%出栈
                    stack.pop();
                    //获取%前面的数字，可能不止一位
                    String num = "";
                    while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9'){
                        num = stack.pop() + num;
                    }
                    int n = 1;
                    if(!"".equals(num)){
                        n = Integer.parseInt(num);
                    }
                    for(int j=0;j<n;++j){
                        for(int k=0;k<temp.length();++k){
                            stack.push(temp.charAt(k));
                        }
                    }
                }
            }
            String res = "";
            while(!stack.isEmpty()){
                res = stack.pop() + res;
            }
            System.out.println(res);
        }
    }
}
