package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,10,15,20,25,30};
        int tar=sc.nextInt();
        System.out.println(findElementUsingBinarySearch(arr,tar));
    }
    public static int findElementUsingBinarySearch(int[] arr,int tar){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]>tar){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
