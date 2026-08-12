package PriorityQueue;
import java.util.*;
public class topKFrequentElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1,2,3,1,2,3,1,2,2};
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return map.get(a)-map.get(b);
        });
        for(int num:map.keySet()){
            pq.offer(num);
            while(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        System.out.println(Arrays.toString(res));
    }
}
