package Recursion;

import java.util.Scanner;

public class SumofSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findSquare(n);
        System.out.println(res);
    }
    public static int findSquare(int n){
        if(n==0){
            return 0;
        }
        int a=findSquare(n-1)+n*n;
        return a;
    }
}
