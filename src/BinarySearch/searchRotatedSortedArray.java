package BinarySearch;

import java.util.Scanner;

public class searchRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={50,60,70,80,90,100,10,20,30,40};
        int target=sc.nextInt();
        int idx=findIndexTarget(arr,target);
        System.out.println(idx);

    }
    public static int findIndexTarget(int[] nums,int target){
        int len=nums.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>nums[len-1]){
                if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    if(nums[0]>target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
            else{
                if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    if(nums[len-1]<target){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
        }
        return -1;
    }
}
