package Stack;
import java.util.*;
public class BaseballGame {
    public static int calpoints(String[] ops){
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(String op : ops){
            if(op.equals("+")){
                int top=st.pop();
                int last_top=st.peek();
                st.push(top);
                st.push(top+last_top);
                sum+=st.peek();

            }
            else if(op.equals("D")){
                    st.push(2*st.peek());
                    sum+=st.peek();

            }
            else if(op.equals("C")){
                int del = st.pop();
                sum-=del;

            }
            else{
                st.push(Integer.valueOf(op));
                sum+=Integer.valueOf(op);

            }



        }
        return sum;


    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String inp[] = new String[n];
      int i =0;
      while(n-->0){
          inp[i++]=sc.next();

      }
        int ans = calpoints(inp);
        System.out.println(ans);

    }



}
/*
Stack was an ideal data structure cuz all the operations required last element or the second last at max
Time complexity : O(N); passing though the string array is O(N) and performing O(1) operations
Space complexity : O(N) space for storing the stack
 */
