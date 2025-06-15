package Hard;



public class MaximumProductSubarray_Lc152 {



    public int maxProduct(int[] nums) {
        if (nums == null) {
            return 0;
        }
        //Always for the first Element is Greater
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                max = Math.max(max, product);
            }
        }
        return max;
    }
}
