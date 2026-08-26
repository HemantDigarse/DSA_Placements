package Recursion.Array;

import java.util.Arrays;
import java.util.Scanner;

public class revArrayInPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int i,int j){
        if(i>j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(arr,i+1,j-1);
    }
}
