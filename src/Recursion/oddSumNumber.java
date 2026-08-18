package Recursion;

import java.util.Scanner;

public class oddSumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findOddNumSum(n);
        System.out.println(res);
    }
    public static int findOddNumSum(int n){
        if(n==0){
            return 0;
        }
        int a=findOddNumSum(n-1)+(n*2)-1;
        return a;
    }
}
