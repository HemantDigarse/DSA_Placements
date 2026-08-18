package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=findSum(n);
        System.out.println(ans);
    }
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        int a=findSum(n-1);
        int ans=a+n;
        return ans;
    }
}
