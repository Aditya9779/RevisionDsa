package Easy;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
       int []nums=new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(nums,3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k = k % nums.length;
        rotate1(nums, k);
    }

    public void rotate1(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }


    }
}
