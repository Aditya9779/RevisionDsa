package Easy;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] result = floorAndCeil(new int[]{1, 2, 4, 6, 10}, 5);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]); // Output: Floor: 4, Ceil: 6
    }

    public static int[] floorAndCeil(int[] nums, int x) {
        if (nums.length == 0) return new int[]{-1, -1};

        int floor = helper(nums, x, true);
        int ceil = helper(nums, x, false);

        return new int[]{floor, ceil};
    }

    static int helper(int[] nums, int x, boolean isFloor) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isFloor) {
                if (nums[mid] < x) {
                    ans = nums[mid];
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] <= x) {
                    start = mid + 1;
                } else {
                    ans = nums[mid];
                    end = mid - 1;

                }
            }
        }

        return ans;
    }
}
