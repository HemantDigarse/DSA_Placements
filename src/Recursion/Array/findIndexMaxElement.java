package Recursion.Array;

import java.util.Scanner;

public class findIndexMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] idx=findIdx(arr,0);
        System.out.println(idx[1]);
    }
    public static int[] findIdx(int[] arr,int i){
        if(i==arr.length){
            return new int[]{Integer.MIN_VALUE,-1};
        }
        int[] a=findIdx(arr,i+1);
        if(arr[i]>a[0]){
            a[0]=arr[i];
            a[1]=i;
        }
        return a;
    }
}
