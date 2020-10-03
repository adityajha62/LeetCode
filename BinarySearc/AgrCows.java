package BinarySearc;
import java.util.*;
//N number of shelters
//C cows
//arr[1,2..n] x co-ordinate of shelters
//find minimum separation S.T each of the two cows are the farthest

public class AgrCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(separation(arr,c,n));
    }
    public static int  separation(int[] positions, int cows,int n){
        int lo=0;
        int high=positions[n-1]-positions[0];
        while(lo+1<high){
            int mid = lo + (high-lo)/2;

            if(isvalid(positions,cows,mid)){
                lo=mid;
            }
            else{
                high=mid-1;
            }
        }

        return  isvalid(positions,cows,Math.max(lo,high)) ? Math.max(lo,high) : lo+high-Math.max(lo,high);
    }
    public static boolean isvalid(int[] positions , int cows,int mid){
           int count=1;
           int lastpos=positions[0];
           for(int i =1;i<positions.length;i++){
               if(positions[i]-lastpos>=mid){
                   lastpos=positions[i];
                   count++;
                   if(count==cows) return true;
               }

           }
           return false;

    }
}
