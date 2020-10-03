package Array;

import java.util.Scanner;

public class ToeplitzMatrix
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns");
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("new row");
        }
        System.out.println(find(arr));
    }
    
    public static boolean find(final int[][] arr) {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = 1; j < arr[i].length; ++j) {
                if (arr[i][j] != arr[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
