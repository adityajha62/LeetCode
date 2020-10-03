package Array;

import java.util.Arrays;
import java.util.HashSet;

public class dupsIncrement
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 2, 4, 20, 2000 };
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
            else {
                for (int j = arr[i] + 1; j < 2000; ++j) {
                    if (!set.contains(j)) {
                        arr[i] = j;
                        set.add(j);
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
