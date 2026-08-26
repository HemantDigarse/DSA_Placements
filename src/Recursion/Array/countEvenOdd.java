package Recursion.Array;

public class countEvenOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] res=findCountEvenOrOdd(arr,0);
        System.out.println("Even Number: "+res[0]+" Odd Number: "+res[1]);
    }
    public static int[] findCountEvenOrOdd(int[] arr,int i){
        if(i==arr.length){
            return new int[]{0,0};
        }
        int[] res=findCountEvenOrOdd(arr,i+1);
        if(arr[i]%2==0){
            res[0]++;
        }
        else{
            res[1]++;
        }
        return res;
    }
}
