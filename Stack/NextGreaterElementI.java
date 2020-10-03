package Stack;
import java.util.*;
public class NextGreaterElementI {
    public static void main(String[] args) {

        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer,Integer> m1 = new HashMap<>();
            Stack<Integer> st = new Stack<>();
            for(int i=nums2.length-1;i>=0;i--){
                while(!st.isEmpty() && nums2[i]>st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    m1.put(nums2[i],st.peek());
                }
                st.push(nums2[i]);
            }
            for(int i=0;i<nums1.length;i++){
                nums1[i]=m1.getOrDefault(nums1[i],-1);
            }
            return nums1;


        }
    }

