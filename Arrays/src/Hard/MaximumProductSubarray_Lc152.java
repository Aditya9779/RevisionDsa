package Hard;


public class MaximumProductSubarray_Lc152 {
    public static void main(String[] args) {
        MaximumProductSubarray_Lc152 obj = new MaximumProductSubarray_Lc152();
        int[] nums = {2, 3, -2, 4};
        System.out.println(obj.maxProduct(nums));
        System.out.println(obj.maximumProductSubarray(nums));
    }

    //O(N^2)
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

    //O(N)
    //https://youtu.be/Y6B-7ZctiW8
    public int maximumProductSubarray(int[] nums) {
        if (nums.length == 0) return 0;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= nums[i];
            rightProduct *= nums[nums.length - 1 - i];
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }

}
