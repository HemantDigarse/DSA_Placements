package PriorityQueue;
import java.util.*;
public class topKFrequentWord {
    public static void main(String[] args) {
        String[] words={"i","love","leetcode","i","love","coding"};
        int k = 2;
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            int freqCompare=Integer.compare(map.get(a),map.get(b));
            if(freqCompare!=0){
                return freqCompare;
            }

            return b.compareTo(a);
        });
        for(String str:map.keySet()){
            pq.offer(str);
            while(pq.size()>k){
                pq.poll();
            }
        }
        List<String> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        System.out.println(res);

    }
}
