package twoPointers;

public class miniAbs {
    public static void main(String[] args) {
        int[] A=new int[]{1, 4, 5, 8, 10};
        int[] B=new int[]{6, 9, 15};
        int[] C=new int[]{2, 3, 6, 6 };
        int i=0,j=0,k=0,max,min;
        int diff=Integer.MAX_VALUE;
        while(i<A.length && j<B.length && k < C.length){
            max=Math.max(A[i],Math.max(B[j],C[k]));
            min=Math.min(A[i],Math.min(B[j],C[k]));
            
            if(diff>max-min){
                diff=max-min;
            }
            if(A[i]==min) i++;
            else if(B[j]==min) j++;
            else k++;
        }
        System.out.println(diff);
    }
}
