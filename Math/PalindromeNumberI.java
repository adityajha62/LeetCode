package Math;
//picking first and last
public class PalindromeNumberI {
    public static void main(String[] args) {
        int n =1223221;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        int digit=1;
        int x=n;
        while(x!=0){
            digit*=10;
            x/=10;
        }
        digit/=10;

        while(digit!=0){
            if((n/digit)%10 != n%10) return false;
            else
            {
                n/=10;
                digit/=100;

            }

        }
        return true;
    }
}
