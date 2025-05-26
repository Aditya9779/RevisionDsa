package Medium;
public class RearrangeArrayElementsBySign_Lc2149 {
    public static void main(String[] args) {
        RearrangeArrayElementsBySign_Lc2149 obj = new RearrangeArrayElementsBySign_Lc2149();
        int[] nums = new int[]{3, 1, -2, -5, 2, -4};
        for (int x : obj.rearrangeArray(nums)) {
            System.out.print(x + " ");
        }
    }

    public int[] rearrangeArray(int[] nums) {
        if (nums.length == 0) return nums;
        int[] po = new int[nums.length / 2];
        int[] ne = new int[nums.length / 2];
        int idx = 0, idx1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                po[idx++] = nums[i];
            } else {
                ne[idx1++] = nums[i];
            }
        }
        idx = 0;
        idx1 = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                nums[i] = po[idx++];
                flag = false;
            } else {
                nums[i] = ne[idx1++];
                flag = true;
            }
        }
        return nums;
    }
}
