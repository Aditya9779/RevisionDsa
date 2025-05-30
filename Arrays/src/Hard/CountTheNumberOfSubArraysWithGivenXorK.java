package Hard;

import java.util.HashMap;

public class CountTheNumberOfSubArraysWithGivenXorK {
    public static void main(String[] args) {
        System.out.println(countTheNumber(new int[]{4, 2, 2, 6, 4}, 6));
        System.out.println(countTheNumberBest(new int[]{5, 6, 7, 8, 9}, 5));
    }

    static int countTheNumber(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }
        int sum, count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum ^= nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /*O(n)*/
    static int countTheNumberBest(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
            if (map.containsKey(sum ^ k)) {
                count += map.get(sum ^ k);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return count;
    }
}
