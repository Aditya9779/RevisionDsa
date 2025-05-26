package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public void insertionSort(int[] nums) {
        if (nums.length == 0) return;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int key = nums[i];
            while (j >= 0 && key <nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
