package mytest;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(getRevert(1234992199));

    }

    public static int[] getSumArray(int[] arr, int target) {
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (diff.containsKey(target - arr[i])) {
                return new int[]{diff.get(target - arr[i]), i};
            } else {
                diff.put(target - arr[i], i);
            }
        }
        return null;
    }

    public static int getRevert(int source) {
        int result = 0;
        while (source / 10 != 0) {
            int last = source % 10;
            result = result*10 + last;
            source= source/10;
        }
        long temp = result*10l+source;
        if (temp > Integer.MAX_VALUE){
            return -1;
        }
        return (int)temp;


    }

}
