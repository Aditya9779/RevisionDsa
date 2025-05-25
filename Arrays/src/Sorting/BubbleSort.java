package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public void bubbleSort(int[] nums) {
        if (nums.length == 0) return;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
