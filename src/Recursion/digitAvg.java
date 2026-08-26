package Recursion;

import java.util.Scanner;

public class digitAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=findSumDigits(n);
        int count=countDigits(n);
        System.out.println(sum/count);
    }
    public static int findSumDigits(int n){
        if(n==0){
            return 0;
        }
        int a=findSumDigits(n/10)+n%10;
        return a;
    }
    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return countDigits(n/10)+1;
    }
}
