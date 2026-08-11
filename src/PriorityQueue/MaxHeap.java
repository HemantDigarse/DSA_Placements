package PriorityQueue;

import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr={10,2,1,8,9,5};
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int num:arr){
            pq.add(num);
        }
        System.out.println(pq);

    }
}

