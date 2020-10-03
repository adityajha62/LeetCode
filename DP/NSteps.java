package DP;

import java.util.Arrays;

//memo-ized
public class NSteps {
    public static void main(String[] args) {
        int n=12; // 1 indexed
        int[] memo= new int[n+1];  //0 indexed ; than using memo[0] for n=1;
        Arrays.fill(memo,-1);
        System.out.println(ways(memo,n));

    }
    static int ways(int[] memo, int n){
        if(n<0) return 0;
        else if(n==0){
            return 1;
        }
        else if(memo[n]>-1) return memo[n];
        else{
            memo[n]= ways(memo,n-1)+ways(memo,n-2)+ways(memo,n-3);
            return memo[n];
        }

        }
    }

