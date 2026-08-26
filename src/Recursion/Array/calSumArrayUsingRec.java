package Recursion.Array;

public class calSumArrayUsingRec {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int res=sum(arr,0);
        System.out.println(res);
    }
    public static int sum(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }
        int s=sum(arr,i+1);
        s+=arr[i];
        return s;
    }
}
