package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        MergeSort obj = new MergeSort();
        obj.mergeSortCall(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void mergeSortCall(int[] nums) {
        if (nums == null || nums.length == 0) return;
        mergeSort(nums, 0, nums.length - 1);
    }

    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            temp[k++] = (nums[i] <= nums[j]) ? nums[i++] : nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= end) temp[k++] = nums[j++];

        for (int z = 0; z < temp.length; z++) {
            nums[start + z] = temp[z];
        }
    }
}
