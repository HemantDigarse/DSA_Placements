package Recursion.Array;

import java.util.Scanner;

public class printArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(arr,0);
    }
    public static void print(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        print(arr,i+1);
    }
}
