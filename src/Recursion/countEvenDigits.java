package Recursion;

import java.util.Scanner;

public class countEvenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=findCountEvenDigits(n);
        System.out.println(res);
    }
    public static int findCountEvenDigits(int n){
        if(n==0){
            return 0;
        }
        int a=findCountEvenDigits(n/10);
        if((n%10)%2==0){
            a+=1;
        }
        return a;
    }
}
