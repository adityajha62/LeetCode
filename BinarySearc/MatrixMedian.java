package BinarySearc;

import java.util.Arrays;

//m * n is always odd and each row is ascending, find the median of the sorted matrix
public class MatrixMedian {
    public static void main(String[] args) {
        int A[][] = new int[][]{{1, 2, 3}, {14, 15, 16}, {7, 18, 29}};
        int r=A.length;
        int c =A[0].length;
            int min=A[0][0],max=A[0][c-1];
            for(int i =1;i<r;i++){
                if(A[i][0]<min) min =A[i][0];
            }
        for(int i =1;i<r;i++){
            if(A[i][c-1]>max) max =A[i][c-1];
        }

        int desired=(r*c+1)/2;
            int get,mid;
            while(min<max){
                int left=0;
                mid=min+(max-min)/2;
                for(int i =0;i<r;i++){
                    get =Arrays.binarySearch(A[i],mid);
                    if(get<0){   //-position-1;
                        get=Math.abs(get)-1;
                    }
                    else{ //handle duplicates
                        while(get<A[i].length && A[i][get]==mid) {
                            get++;
                        }
                    }
                    left+=get;
                }
                if(left<desired) min=mid+1;
                else max=mid;
            }
        System.out.println(min);


    }
}
