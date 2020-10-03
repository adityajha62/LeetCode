package String;

public class PalindromePermutaion {
    public static void main(String[] args) {
        String phrase ="liri  l";
        phrase.toLowerCase();
        int [] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')];
        int countOdd=0;
        for(char c : phrase.toCharArray()){
        int x = getval(c);
        if(x!=-1) {
            table[x]++;
            if(table[x]%2!=0) countOdd++;
            else countOdd--;
        }
        }
        if(countOdd>1) System.out.println("nope");
        else
            System.out.println("yeah, palindrome permutation");


    }
    static int getval(char c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(val<=z && val>=a){
            return val-a;
        }
        else
            return -1;
    }

    }

