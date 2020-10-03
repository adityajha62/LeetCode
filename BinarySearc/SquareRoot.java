package BinarySearc;
import java.util.*; // does not handle overflow
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(root(sc.nextInt()));
    }
    public static int root(int n){
        if(n==1||n==0) return n;
        int lo=0,hi=n-1;
        int mid,ans=0;
        while(lo<hi){
            mid=lo+(hi-lo)/2;

            if(mid*mid<n){
                ans=mid;
                lo=mid+1;
            }
            else if(mid*mid==n) return mid;
            else{
                hi=mid-1;
            }
        }
        if(lo*lo<=n) return lo;
        else return ans;

    }

}
