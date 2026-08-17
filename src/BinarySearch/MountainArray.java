package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,1};
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("This is not a Mountain Array");
    }
}
