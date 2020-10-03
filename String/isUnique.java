package String;

import java.util.*;

public class isUnique {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        boolean flag=true;
        for (char letter : word.toCharArray()) {
            if(set.contains(letter)) {
               flag=false;
                break;
            }
            else
                set.add(letter);

        }
        if(flag) System.out.println("no repeats");
        else System.out.println("there are repeats");
    }

}
