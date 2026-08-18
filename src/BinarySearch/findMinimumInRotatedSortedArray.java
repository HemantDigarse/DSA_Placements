package BinarySearch;

public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        int min=findMinElement(nums);
        System.out.println(min);
    }
    public static int findMinElement(int[] nums){
        int len=nums.length;
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[len-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
                res=mid;
            }
        }
        return nums[res];
    }
}
