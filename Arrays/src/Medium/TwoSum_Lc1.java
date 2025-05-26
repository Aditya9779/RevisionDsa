package Medium;

import java.util.HashMap;

public class TwoSum_Lc1 {
    public static void main(String[] args) {
        TwoSum_Lc1 obj=new TwoSum_Lc1();
        int []nums=new int[]{2,7,8,3,5};
        int []ans= obj.twoSum(nums,9);
        for (int x:ans) {
            System.out.print(x + " ");
        }
    }
    int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[]{};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
