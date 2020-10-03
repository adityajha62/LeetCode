package DP;

public class MagicIndex {
    public static void main(String[] args) {
        int arr[]=new int[]{-1,0,1,2,4,7};
        int lo=0,hi=arr.length-1;
        while(lo+1<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]-mid<0){
                lo=mid+1;
            }
            else if(arr[mid]-mid>0){
                hi=mid-1;
            }
            else {
                lo = mid;
                break;
            }
        }
       int val = arr[lo]-lo==0 ? lo : hi;
        System.out.println(val);

    }
}
