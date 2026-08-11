package PriorityQueue;

import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr={10,5,8,9,3,5,8,2,1};
        int k=4;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int num:arr){
            pq.offer(num);
            while(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.poll());
    }
}

