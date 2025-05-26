package Medium;

public class Sort120_Lc75 {
    public static void main(String[] args) {
        Sort120_Lc75 obj = new Sort120_Lc75();
        int[] nums = new int[]{0, 1, 1, 0, 2, 0};
        obj.sort(nums);
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }

    void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        int start = 0, mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    int temp0 = nums[mid];
                    nums[mid] = nums[start];
                    nums[start] = temp0;
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //Just for swapping the end and mid values no need to increment
                    // mid in this because mid is 1
                    int temp1 = nums[mid];
                    nums[mid] = nums[end];
                    nums[end] = temp1;
                    end--;
                    break;
                default:
                    break;
            }
        }
    }
}
