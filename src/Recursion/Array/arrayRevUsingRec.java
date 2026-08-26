package Recursion.Array;

import java.util.Scanner;

public class arrayRevUsingRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printRev(arr,0);
    }
    public static void printRev(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        printRev(arr,i+1);
        System.out.println(arr[i]);
    }
}
