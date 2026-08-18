package Recursion;

import java.util.Scanner;

public class evenSumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findSumEvenNum(n);
        System.out.println(res);
    }
    public static int findSumEvenNum(int n){
        if(n==0){
            return 0;
        }
        int a=findSumEvenNum(n-1);
        int ans=a+n*2;
        return ans;
    }
}
