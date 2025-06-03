package Hard;

import java.util.ArrayList;

public class ReversePairs_Lc493 {
    static int reversePairs(int[] nums) {
        if (nums.length == 0) return 0;
        return callMerge(nums, 0, nums.length - 1);
    }

    private static int callMerge(int[] nums, int left, int right) {
        int mid = left + (right - left) / 2;
        int count = 0;
        count += callMerge(nums, left, mid);
        count += callMerge(nums, mid + 1, right);
        count += reversePairsFind(nums, left, mid, right);
        mergeSort(nums, left, mid, right);
        return count;

    }

    private static void mergeSort(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i <= mid && j <= right) {
            arrayList.add(nums[i] < nums[j] ? nums[i++] : nums[j++]);
        }
        while (i <= mid) {
            arrayList.add(nums[i++]);
        }
        while (j <= right) {
            arrayList.add(nums[j++]);
        }
        for (int k = 0; k < arrayList.size(); k++) {
            nums[k + left] = arrayList.get(k);
        }
    }

    private static int reversePairsFind(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int count = 0;
        while (i <= mid) {
            while (j <= right && (long) nums[i] > 2L * (long) nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
            i++;
        }
        return count;
    }

}
