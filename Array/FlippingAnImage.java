package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingAnImage
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns of mat");
        final int n = sc.nextInt();
        final int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("new row");
        }
        final int[][] ans = flipper(arr);
        for (int k = 0; k < ans.length; ++k) {
            System.out.println(Arrays.toString(ans[k]));
        }
    }
    
    public static int[][] flipper(final int[][] A) {
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[i].length / 2; ++j) {
                final int swap = A[i][A[i].length - 1 - j] ^ 0x1;
                A[i][A[i].length - 1 - j] = (A[i][j] ^ 0x1);
                A[i][j] = swap;
            }
            if (A[i].length % 2 != 0) {
                final int[] array = A[i];
                final int n = A[i].length / 2;
                array[n] ^= 0x1;
            }
        }
        return A;
    }
}
