package Easy;

public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(countOccurrences(new int[]{1, 2, 3, 4, 5, 5, 6}, 5));
    }

    static int countOccurrences(int[] nums, int x) {
        return searchRange(nums, x);
    }

    public static int searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int start = search(nums, target, true);
        if (start==-1) return 0;
        int end = search(nums, target, false);
        return end-start+1;
    }

    public static int search(int[] nums, int target, boolean firstCheck) {
        if (nums.length == 0)
            return -1;
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (firstCheck) {
                if (nums[mid] == target) {
                    ans = mid;
                    end = mid - 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] == target) {
                    ans = mid;
                    start = mid + 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return ans;
    }
}
