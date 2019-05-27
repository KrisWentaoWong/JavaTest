package com.company.java.oj.byteDance0525;

import java.util.Scanner;

/**
 * 找出二维数组中1的区块数，8个方向相邻算一个区块
 * Created by wtwang on 2019/5/25.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int N = in.nextInt();
            int M = in.nextInt();
            if(N >0 && M >0) {
                int[][] arr = new int[N][M];
                for (int i = 0; i < N; ++i) {
                    for (int j = 0; j < M; ++j) {
                        arr[i][j] = in.nextInt();
                    }
                }
                boolean[][] visited = new boolean[N][M];
                int res = 0;
                for (int i = 0; i < N; ++i) {
                    for (int j = 0; j < M; ++j) {
                        if (!visited[i][j] && arr[i][j] == 1) {
                            bfs(i, j, arr, visited);
                            res++;
                        }
                    }
                }
                System.out.println(res);
            }else{
                System.out.println(0);
            }
        }
    }

    public static void bfs(int i,int j,int[][] arr,boolean[][] visited){
        if(i>=0 && i<arr.length && j>=0 && j<arr[0].length && !visited[i][j] && arr[i][j] == 1) {
            visited[i][j] = true;
            bfs(i-1,j-1,arr,visited);
            bfs(i-1,j,arr,visited);
            bfs(i-1,j+1,arr,visited);
            bfs(i,j-1,arr,visited);
            bfs(i,j+1,arr,visited);
            bfs(i+1,j-1,arr,visited);
            bfs(i+1,j,arr,visited);
            bfs(i+1,j+1,arr,visited);
        }

    }
}
