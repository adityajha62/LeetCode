package Stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String S="ab#c";
        String T="ad#c";
        System.out.println(compare(S,T));
    }
    public static boolean compare(String S, String T){
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        char[] s= S.toCharArray();
        char[] t= T.toCharArray();
        for (int i = 0; i <s.length ; i++) {
            if(s[i]!='#')  st.push(s[i]);
            else st.pop();
        }
            for ( int i = 0; i <t.length ; i++) {
                if(t[i]!='#')  st1.push(t[i]);
                else st1.pop();
                }
        return String.valueOf(st).equals(String.valueOf(st1));
    }


}
