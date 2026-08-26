package Recursion;

import java.util.Scanner;

public class findMaxandMinDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=findMinDigit(n);
        int max=findMaxDigit(n);
        System.out.println(min+"---->"+max);
    }
    public static int findMinDigit(int n){
        if(n==0){
            return Integer.MAX_VALUE;
        }
        int a=findMinDigit(n/10);
        int min=Math.min(a,n%10);
        return min;
    }
    public static int findMaxDigit(int n){
        if(n==0){
            return Integer.MIN_VALUE;
        }
        int a=findMaxDigit(n/10);
        int max=Math.max(a,n%10);
        return max;
    }
}
