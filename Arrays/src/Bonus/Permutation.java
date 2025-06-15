package Bonus;


public class Permutation {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        Permutation obj = new Permutation();
//        System.out.println(Arrays.toString(obj.generatePermutation(input, 0)));
        obj.generatePermutation(input, 0);
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void print(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void generatePermutation(int[] nums, int index) {
        if (index == nums.length) {
            /*Or instead of printing manual
             * we can use the Array.string() function
             *  System.out.println(Arrays.toString(nums));*/

            print(nums);

            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            generatePermutation(nums, index + 1);
            swap(i, index, nums);
        }

    }
}
