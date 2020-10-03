package String;
import java.util.*;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.length() != b.length()) System.out.println("false");
        else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : a.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else
                    map.put(c, 1);
            }

            for(char c : b.toCharArray()){
                if(!map.containsKey(c) || map.get(c)==0) System.out.println("false");
                else{
                    map.put(c,map.get(c)-1);
                }
            }
            System.out.println("true");
        }
    }
}
