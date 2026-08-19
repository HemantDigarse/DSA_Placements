package BinarySearch;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        int max=Integer.MIN_VALUE;
        for(int num:piles){
            max=Math.max(num,max);
        }
        int res=-1;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=findHours(mid,piles);
            if(hours>h){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        System.out.println(res);
    }
    public static long findHours(int mid,int[] piles){
        long hours=0;
        for(int num:piles){
            hours+=num/mid;
            if(num%mid!=0){
                hours++;
            }
        }
        return hours;
    }
}
