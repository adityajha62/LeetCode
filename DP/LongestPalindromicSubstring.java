package DP;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str="ga";
        int n=str.length();
        boolean dp[][]=new boolean[n][n];
        int begin=0;
        int maxlength=1;
        for(int i=0;i<n;i++){
            dp[i][i]=true;

        }
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) {
                dp[i][i+1] = true;
                begin=i;
                maxlength=2;
            }

        }
        for(int length=3;length<=n;length++){
            for(int i=0;i<n-length+1 ;i++){
                int j=i+length-1;
                if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    begin=i;
                    maxlength=j;
                }
            }
        }

        System.out.println(str.substring(begin,maxlength+1));
    }
}
