package Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12211;
        System.out.println(n==reverse(n));
    }
    public static int reverse(int n){
        int rem =0,out=0;
        while(n!=0){

            rem= (n%10);
            out=10*out+rem;

            n/=10;
        }
        return out;
    }
}
