package BinarySearc;

public class FindMinimuminSortedRotatedArray {
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,6,-1,0,1,2};

        int lo=0,hi=arr.length-1;

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            int A_L=arr[lo];
            int A_R=arr[hi];
            int A_M= arr[mid];
            if(A_M>=A_R)
            {
             lo=mid+1;
            }
            else
                hi=mid;
        }

        System.out.println(arr[lo]);
    }
}
