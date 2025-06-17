package Easy;

public class ImplementLowerBound {
    public static void main(String[] args) {
        System.out.println(implementLowerBound(new int[]{1,2,2,3},2));
    }

    public static int implementLowerBound(int[] nums, int x) {
        if (nums.length == 0) return -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
