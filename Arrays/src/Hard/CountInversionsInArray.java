package Hard;

import java.util.ArrayList;

public class CountInversionsInArray {
    public static void main(String[] args) {
        System.out.println(countInversionsInArray(new int[]{5, 3, 2, 1, 4}));
        System.out.println(countInversionsInArray_Best(new int[]{5, 3, 2, 1, 4}));
    }

    /*O(n^2)*/
    static int countInversionsInArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int idx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) return 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;

    }

    /*O(nlog*n)*/
    static int countInversionsInArray_Best(int[] nums) {
        if (nums == null) {
            return 0;
        }
        return callCountInversions(nums, 0, nums.length - 1);
    }

    private static int callCountInversions(int[] nums, int low, int right) {
        if (low >= right) return 0;
        int mid = low + (right - low) / 2;
        int count = 0;
        count += callCountInversions(nums, low, mid);
        count += callCountInversions(nums, mid + 1, right);
        count += merge(nums, low, mid, right);
        return count;

    }

    private static int merge(int[] nums, int low, int mid, int right) {
        int i = low;
        int j = mid + 1;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                arrayList.add(nums[i]);
                i++;
            } else {
                arrayList.add(nums[j]);
                //Imp line just think
                count += mid - i + 1;
                j++;
            }
        }
        while (i <= mid) {
            arrayList.add(nums[i]);
            i++;
        }
        while (j <= right) {
            arrayList.add(nums[j]);
            j++;
        }
        for (int k = 0; k < arrayList.size(); k++) {
            nums[k + low] = arrayList.get(k);
        }
        return count;

    }
}
