package Stack;

import java.util.Stack;

public class sort {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> out = new Stack<>();

        st.push(3);
        st.push(1);
        st.push(2);
        st.push(6);
        st.push(5);
        st.push(21);

        out.push(st.pop());

        while (!st.isEmpty()) {

            int top = st.pop();
            if (top > out.peek()) {
                out.push(top);
            } else {
                while (!out.isEmpty() && top < out.peek()) {
                    st.push(out.pop());
                }
                out.push(top);
            }

        }
        st = out;
        System.out.println(st);
    }
}











