package Easy;

public class SearchInSortedArray2_Lc81 {
    public static void main(String[] args) {
        System.out.println(new SearchInSortedArray2_Lc81().searchInSortedArray2(new int[]{4,5,6,7,0,1,2},0));
    }

    public boolean searchInSortedArray2(int[] nums, int target) {
        if (nums.length == 0) return false;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //Very Imp for the --not necessarily with distinct values) in Question
            //example nums=[3,2,4,5,3,5,45,3]; see the 3 is coming in the Last/Middle/Start
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }
            //Left Half
            if (nums[start] <= nums[mid]) {
                if(nums[start]<=target && nums[mid]>=target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            //Right Half
            else{
                if(nums[end]>=target && nums[mid]<=target){
                  start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return false;
    }
}

