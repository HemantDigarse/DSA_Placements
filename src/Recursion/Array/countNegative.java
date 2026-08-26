package Recursion.Array;

import java.util.Scanner;

public class countNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=countNegative(arr,0);
        System.out.println(res);
    }
    public static int countNegative(int[] arr,int i){
        if(i==arr.length){
            return 0;
        }
        int a=countNegative(arr,i+1);
        if(arr[i]<0){
            a+=1;
        }
        return a;
    }
}
