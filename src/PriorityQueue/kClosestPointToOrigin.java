package PriorityQueue;
import java.util.*;
public class kClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}}; int k = 1;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return b[2]-a[2];
        });
        for(int[] point:points){
            int[] a=new int[3];
            a[0]=point[0];
            a[1]=point[1];
            a[2]=point[0]*point[0]+point[1]*point[1];
            pq.offer(a);
            while(pq.size()>k){
                pq.poll();
            }
        }
        int[][] res=new int[k][2];
        int i=0;
        for(int[] arr:pq){
            res[i][0]=arr[0];
            res[i][1]=arr[1];
            i++;
        }
        for(int[] p:res) {
            System.out.println(Arrays.toString(p));
        }
    }
}
