package Easy;

import java.util.Arrays;

public class FindFirstAndLast_Lc34 {
    public static void main(String[] args) {
        FindFirstAndLast_Lc34 obj=new FindFirstAndLast_Lc34();
        System.out.println(Arrays.toString(obj.searchRange(new int[]{1, 2, 3, 4, 5, 5, 6}, 5)));
    }
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int f = search(nums, target, true);
        int c = search(nums, target, false);
        return new int[] { f, c };
    }

    public int search(int[] nums, int target, boolean firstCheck) {
        if (nums.length == 0)
            return -1;
        int ans = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (firstCheck) {
                if (nums[mid] == target) {
                    ans = mid;
                    end=mid-1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] == target) {
                    ans = mid;
                    start=mid+1;
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
