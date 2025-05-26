package Medium;

public class MaximumSubarray_Lc53 {
    public static void main(String[] args) {
        MaximumSubarray_Lc53 obj = new MaximumSubarray_Lc53();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(obj.maxSubArray(nums));

    }
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = 0, ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}
