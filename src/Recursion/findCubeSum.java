package Recursion;

import java.util.Scanner;

public class findCubeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findSum(n);
        System.out.println(res);
    }
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        int a=findSum(n-1);
        int ans=a+n*n*n;
        return ans;
    }
}
