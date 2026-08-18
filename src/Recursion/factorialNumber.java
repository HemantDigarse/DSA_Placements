package Recursion;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findFact(n);
        System.out.println(res);
    }
    public static int findFact(int n){
        if(n==0){
            return 1;
        }
        int a=findFact(n-1);
        int ans=a*n;
        return ans;
    }
}
