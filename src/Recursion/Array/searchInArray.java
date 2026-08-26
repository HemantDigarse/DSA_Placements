package Recursion.Array;

import java.util.Scanner;

public class searchInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int[] arr={10,30,40,50,60};
        int res=findTarget(arr,0,tar);
        System.out.println(res);
    }
    public static int findTarget(int[] arr,int i,int tar){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==tar){
            return i;
        }
        int idx=findTarget(arr,i+1,tar);
        return idx;
    }
}
