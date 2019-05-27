package com.company.java.oj.byteDance0525;

import java.util.Scanner;

/**
 * 数组中求a[i]+a[j]+i-j最大值
 * Created by wtwang on 2019/5/25.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;++i){
                arr[i] = in.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int i=0;
            for(int j=1;j<N;++j){
                max = Math.max(max,arr[j]+arr[i]+i-j);
                if(arr[j] >= arr[i]){
                    i=j;
                }
            }
            System.out.println(max);
        }
    }
}
