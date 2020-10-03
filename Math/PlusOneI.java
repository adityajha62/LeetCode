package Math;

import java.util.Arrays;

//array based
public class PlusOneI {
    public static void main(String[] args) {
        int arr[]=new int[]{9,9,9,8};
         int i;
        for( i =arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                break;
            }
            else{
                arr[i]=0;
            }
        }
      if(i==-1){
            int[] newarr= new int[arr.length+1];
            newarr[0]=1;
          System.out.println(Arrays.toString(newarr));
      }
      else
        System.out.println(Arrays.toString(arr));
    }
}
