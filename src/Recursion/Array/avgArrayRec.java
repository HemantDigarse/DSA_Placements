package Recursion.Array;

public class avgArrayRec {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int[] res=findAvg(arr,0);
        int avg=res[0]/res[1];
        System.out.println(avg);
    }
    public static int[] findAvg(int[] arr,int i){
        if(i==arr.length){
            return new int[]{0,0};
        }
        int[] a=findAvg(arr,i+1);
        a[0]+=arr[i];
        a[1]++;
        return a;
    }
}
