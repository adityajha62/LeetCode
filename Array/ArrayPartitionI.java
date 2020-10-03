package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPartitionI
{
    public static int sum(final int[] arr) {
        int sol = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i += 2) {
            sol += arr[i];
        }
        return sol;
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] num = new int[n];
        for (int i = 0; i < n; ++i) {
            num[i] = sc.nextInt();
        }
        final int sol = sum(num);
        System.out.println(sol);
    }
}
