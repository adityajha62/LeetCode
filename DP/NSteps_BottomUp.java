package DP;

public class NSteps_BottomUp {
    public static void main(String[] args) {
        int n=12; // 1 indexed
        System.out.println(ways(n));
    }
    static int ways(int n){
        int a=1,b=2,c=4,temp=0;
        for(int i=4;i<=n;i++){
            temp=a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return temp;
    }
}
