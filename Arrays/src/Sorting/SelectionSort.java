package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    //Reference
    /*https://www.youtube.com/shorts/OszAf8ZK7Is*/
    public void selectionSort(int[] nums) {
        if (nums.length == 0) return;
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            swap(min, i, nums);
        }

    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
