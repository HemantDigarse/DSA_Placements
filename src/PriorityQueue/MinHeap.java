package PriorityQueue;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] arr={10,5,2,6,7,1,9};
        for(int num:arr){
            pq.offer(num);
        }
        System.out.println(pq);
    }
}
//In Java By Default PriorityQueue is MinHeap
