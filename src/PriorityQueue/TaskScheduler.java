package PriorityQueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};int n = 2;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->{
            return b-a;
        });
        for(char chr:map.keySet()){
            pq.offer(map.get(chr));
        }
        int res=0;
        while(!pq.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int count=0;
            for(int i=1;i<=n+1&&!pq.isEmpty();i++){
                int num=pq.poll();num--;
                if(num>0){
                    list.add(num);
                }
                count++;
            }
            pq.addAll(list);
            if(pq.size()==0){
                res+=count;
            }
            else{
                res+=(n+1);
            }

        }
        System.out.println(res);
    }
}
