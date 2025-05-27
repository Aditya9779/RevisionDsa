package Medium;

public class NextPermutation_Lc31 {
    public static void main(String[] args) {
        NextPermutation_Lc31 obj = new NextPermutation_Lc31();
        int[] nums = {1, 2, 3};
        obj.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        /*How to Approach this question
         * 1-Check from the back where it is getting the changing
         * the point like nums=[2,1,5,4,3,0,0] so check where it is
         * getting changing at the point like 1,5
         *
         * 2- Check again for the last and change the index from where it
         * is getting change like 1 <-> 3, and we have to change the index form
         * the just bigger from the index of the number like we don't take 4,5 {nums=[2,1,5,4,3,0,0]}
         *
         * 3- Then after change reverse the array just after the index element
         * to get the output */

    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            swap(i, j, nums);
            i++;
            j--;
        }
    }

    void reverse(int i, int j, int[] nums) {
        while (i <= j) {
            swap(i, j, nums);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        if (nums.length == 0) return;
        int n = nums.length;
        /*First step find the changing point*/
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        /*If nothing is their then it means we are on the
         * last permutation line so just change the order
         * for eg- 3,2,1 -- so for this we need to reverse the
         * array only*/
        if (idx == -1) {
            reverse(nums);
            return;
        }
        /*Second step swap the just bigger element from the
         * index from backside*/
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(i, idx, nums);
                break;
            }
        }
        /*Third now reverse the array from the index to get the output*/
        reverse(idx + 1, nums.length - 1, nums);
    }
}
