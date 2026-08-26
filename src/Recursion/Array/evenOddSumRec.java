package Recursion.Array;

public class evenOddSumRec {
    public static void main(String[] args) {
        int[] arr={15,20,35,40,55,60};
        int[] res=findEvenOddSum(arr,0);
        System.out.println(res[0]+"-->"+res[1]);
    }
    public static int[] findEvenOddSum(int[] arr,int i){
        if(i==arr.length){
            return new int[]{0,0};
        }
        int[] a=findEvenOddSum(arr,i+1);
        if(arr[i]%2==0){
            a[0]=a[0]+arr[i];
        }
        else
        {
            a[1]=a[1]+arr[i];
        }
        return a;
    }
}
