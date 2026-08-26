package Recursion;

import java.util.Scanner;

public class digitAvgUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] res=findAvgDigits(n);
        System.out.println(res[0]/res[1]);

    }
    public static int[] findAvgDigits(int n){
        if(n==0){
            return new int[]{0,0};
        }
        int[] a=findAvgDigits(n/10);
        a[0]=a[0]+n%10;
        a[1]++;
        return a;
    }
}
