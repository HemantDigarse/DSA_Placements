package Recursion.Array;

import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=findMin(arr,0);
        System.out.println(min);
    }
    public static int findMin(int[] arr,int i){
        if(i==arr.length){
            return Integer.MAX_VALUE;
        }
        int min=findMin(arr,i+1);
        return Math.min(min,arr[i]);
    }
}
