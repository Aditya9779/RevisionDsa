package Hard;

import java.util.HashMap;

public class LengthOfTheLongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        System.out.println(lengthOfTheLongestSubarrayWithZeroSum(new int[]{9, -3, 3, -1, 6, -5}));
        System.out.println(lengthBest(new int[]{9, -3, 3, -1, 6, -5}));
    }

    /*O(n^2)*/
    static int lengthOfTheLongestSubarrayWithZeroSum(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum , length = 0, count;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            count = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                count++;
                if (sum == 0) {
                    length = Math.max(length, count);
                }
            }
        }
        return length;
    }

    /*O(n)*/
    static int lengthBest(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum) );
            } else {
                map.put(sum, i);
            }
        }
        return length;
    }
}
