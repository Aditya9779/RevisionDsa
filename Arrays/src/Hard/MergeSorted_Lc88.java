package Hard;

import java.util.Arrays;

public class MergeSorted_Lc88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last--] = nums1[m - 1];
                m--;
            } else {
                nums1[last--] = nums2[n - 1];
                n--;
            }
        }
        while (n > 0) {
            nums1[last--] = nums2[n - 1];
            n--;
        }
    }
}
