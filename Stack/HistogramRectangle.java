package Stack;

import java.util.Stack;

public class HistogramRectangle {
    public static void main(String[] args) {
        int arr[] = new int[]{6, 2, 5, 4, 5, 1, 6};
        int curr = 0;
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int height = arr[st.pop()];
                int right = i;
                int left;
                if (!st.isEmpty()) {
                    left = st.peek();
                } else {
                    left = 0;
                    right++;
                }
                curr = (right - left - 1) * height;
                if (curr > max) max = curr;

            }
            st.push(i);

        }
        int right=0 ;
        if(!st.isEmpty())
         right = st.peek();
        int left;
        while (!st.isEmpty()) {
            int height = arr[st.pop()];
            if (!st.isEmpty()) {
                left = st.peek();
            } else {
                left = 0;
                right++;
            }

            curr = (right - left ) * height;
            if (curr > max) max = curr;

        }

        System.out.println(max);
    }
}
