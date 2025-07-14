package Easy;

public class FinMinInRoatSorArray_Lc153 {
    public static void main(String[] args) {
        System.out.println(new FinMinInRoatSorArray_Lc153().findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    public int findMin(int[] nums) {
        if (nums.length == 0)
            return Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            //Imagine nums = [4,5,6,7,0,1,2] see the 7 and 2 if mid is
            //Greater than we have to search in right half that's why start=mid+1
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            //Very Imp just imagine for the nums[3,1,2]
            else {
                end = mid;
            }
        }
        return nums[start];
    }
}
