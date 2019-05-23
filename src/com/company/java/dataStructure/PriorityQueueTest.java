package com.company.java.dataStructure;

import java.util.Comparator;
import java.util.PriorityQueue;

/**最大堆最小堆测试
 * priorityQueue默认是最小堆，如果需要建立最大堆则需要自定义排序规则
 * Created by kriswong on 2019/4/28.
 */
public class PriorityQueueTest {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        pq2.offer(3);
        pq2.offer(4);
        pq2.offer(2);
        pq2.offer(1);
        pq2.offer(5);
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek());
            pq2.poll();
        }


    }
}
