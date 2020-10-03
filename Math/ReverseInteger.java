package Math;
//123 to 321 and 100 to 1 , PS check for overflow
public class ReverseInteger {
    public static void main(String[] args) {
        int rem,out=0;
        int n = 103;
        while(n!=0){
            if(Math.abs(out)> Integer.MAX_VALUE/10){ //catch the overflow before it can spread
                System.out.println("overflow");
                break;
            }
            out*=10;
            rem = n%10;
            out+=rem;
            n/=10;

        }
        System.out.println(out);
    }
}
