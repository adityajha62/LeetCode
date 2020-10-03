package Stack;

import java.util.Stack;

public class RainWater {
    public static void main(String[] args) {
        int height[]= new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Stack<Integer> st = new Stack<>();
        int store=0;
        st.push(0);  //pushing indices
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]<height[i]){
                int last =st.pop();
                if(st.isEmpty()) break;
                store+=(Math.min(height[i],height[st.peek()])-height[last])*(i-st.peek()-1);

            }
            st.push(i);
        }
        System.out.println(store);
    }
}
