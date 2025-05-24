public class MoveZeroes_Lc283 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        MoveZeroes_Lc283 moveZeroesLc283 = new MoveZeroes_Lc283();
        moveZeroesLc283.moveZeroes(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
