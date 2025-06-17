package Easy;

public class ImplementUpperBound {
    public static void main(String[] args) {
        System.out.println(implementUpperBound(new int[]{1, 2, 2, 3}, 2));
    }

    public static int implementUpperBound(int[] nums, int x) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        int ans = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= x) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
