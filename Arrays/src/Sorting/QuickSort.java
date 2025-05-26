package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        QuickSort obj = new QuickSort();
        obj.quickSortCall(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void quickSortCall(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotIndex = findPivotIndex(nums, start, end);
            quickSort(nums, start, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, end);
        }
    }

    public int findPivotIndex(int[] nums, int start, int end) {
        int count = start;
        int pivot = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if (pivot > nums[i]) {
                count++;
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[start];
        nums[start] = nums[count];
        nums[count] = temp;
        return count;
    }


}
