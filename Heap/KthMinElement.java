package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

//unsorted array
public class KthMinElement {
    public static void main(String[] args) {
        int arr[] = new int[]{4,1,2,6,5,8};
        System.out.println(getkth(arr,4));
    }

   static int getkth(int[] arr,int k){
       PriorityQueue<Integer> pq= new PriorityQueue<>(arr.length, minComparator);
       for (int i = 0; i <arr.length ; i++) {
           pq.add(arr[i]);

       }
       for(int i=k-1;i>0;i--)
       pq.poll();
       return pq.peek();

    }
    public static Comparator<Integer> minComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    };


}
