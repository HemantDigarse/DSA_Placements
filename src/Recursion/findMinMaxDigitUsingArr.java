package Recursion;

import java.util.Scanner;

public class findMinMaxDigitUsingArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] res=findMinMax(n);
        System.out.println(res[0]+"--->"+res[1]);
    }
    public static int[] findMinMax(int n){
        if(n==0){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        }
        int[] a=findMinMax(n/10);
        a[0]=Math.min(a[0],n%10);
        a[1]=Math.max(a[1],n%10);
        return a;
    }
}
