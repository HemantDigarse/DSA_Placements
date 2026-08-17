package BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        findUpperBoundOfTarget(arr,x);
    }
    public static void findUpperBoundOfTarget(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(res);
    }
}
