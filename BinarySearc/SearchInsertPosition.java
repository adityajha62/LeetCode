package BinarySearc;
import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args) {


        int arr[] = new int[6];
            Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i]=sc.nextInt();
        }
        int key= sc.nextInt();
        int pos= Arrays.binarySearch(arr,key);
        if(pos>=0)
            System.out.println(pos);
        else
            System.out.println(-1*pos-1);
    }
}