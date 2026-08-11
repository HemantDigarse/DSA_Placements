package PriorityQueue;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr={10,2,1,8,9,5};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            pq.add(num);
        }
        System.out.println(pq);

    }
}
//MinHeap->By Default PriorityQueue is in Mean Heap in java
