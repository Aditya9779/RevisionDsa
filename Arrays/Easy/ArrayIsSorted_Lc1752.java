public class ArrayIsSorted_Lc1752 {
    public static void main(String[] args) {
        int []arr=new int[]{3,4,5,1,2};
        ArrayIsSorted_Lc1752 obj=new ArrayIsSorted_Lc1752();
        System.out.println(obj.check(arr));
    }
        public boolean check(int[] nums) {
            if (nums.length == 0)
                return true;
            boolean flag = true;
            int k = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    flag = false;
                    k = i;
                    break;
                }
            }
            if (flag) {
                return true;
            }
            reverse(nums, k);
            return isSorted(nums);
        }

        public void reverse(int[] nums, int k) {
            if (nums.length == 0)
                return;
            rotate(nums, 0, k );
            rotate(nums, k+1, nums.length - 1);
            rotate(nums, 0, nums.length - 1);
        }

        public void rotate(int []nums, int i, int j) {
            while (i <= j) {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }

        public boolean isSorted(int []nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
