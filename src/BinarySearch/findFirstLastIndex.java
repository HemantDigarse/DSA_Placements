package BinarySearch;

import java.util.Arrays;

public class findFirstLastIndex {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int firstIndex=findFirstIndex(nums,target);
        int lastIndex=findLastIndex(nums,target);
        System.out.println(firstIndex+"-->"+lastIndex);
        if(firstIndex==-1 || lastIndex==-1){
            System.out.println(Arrays.toString(new int[]{-1,-1}));
        }
        System.out.println(Arrays.toString(new int[]{firstIndex,lastIndex}));

    }
    public static int findFirstIndex(int[] nums,int tar){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar){
                res=mid;
                high=mid-1;
            }
            else if(nums[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static int findLastIndex(int[] nums,int tar){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==tar){
                res=mid;
                low=mid+1;
            }
            else if(nums[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
}
