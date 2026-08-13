package PriorityQueue;
import java.util.*;
public class reorganizingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        boolean isEmpty=false;
        for(char chr:s.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            return map.get(b)-map.get(a);
        });
        for(char chr:map.keySet()){
            pq.offer(chr);
        }
        String res="";
        int j=0;
        while(!pq.isEmpty()){
            char chr1=pq.poll();
            if(j==0||res.charAt(j-1)!=chr1){
                res+=chr1;
                j++;
                map.put(chr1,map.get(chr1)-1);
                if(map.get(chr1)==0){
                    map.remove(chr1);
                }
                else{
                    pq.offer(chr1);
                }
            }
            else{
                if(pq.isEmpty()){
                    isEmpty=true;
                    break;
                }
                else{
                    char chr2=pq.poll();
                    res+=chr2;
                    j++;
                    map.put(chr2,map.get(chr2)-1);
                    if(map.get(chr2)==0){
                        map.remove(chr2);
                    }
                    else{
                        pq.offer(chr2);
                    }
                    pq.offer(chr1);
                }
            }
        }
        if(isEmpty){
            System.out.println("");
        }
        else {
            System.out.println(res);
        }
    }
}
