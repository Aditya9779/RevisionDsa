package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_Lc18 {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        for (List<Integer> list : fourSum(nums, 0)) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1])
                            start++;
                        while (start < end && nums[end] == nums[end - 1])
                            end--;
                        start++;
                        end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return ans;
    }
}
