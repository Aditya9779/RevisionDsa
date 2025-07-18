package Easy;

public class SearchInSortedArray1_Lc33 {
    public static void main(String[] args) {
        System.out.println(new SearchInSortedArray1_Lc33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println("Main "+new SearchInSortedArray1_Lc33().searchMain(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
    //Comparing Best Method for Question 1,2 in LC
        public int searchMain(int[] nums, int target) {
            if(nums.length==0) return 0;
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target){
                    return mid;
                }
                //Left Half
                if(nums[start]<=nums[mid]){
                    //Checking like the Target is in between the left and mid value
                    //and if mid is greater than end is minus-- Normal from BinarySearch
                    //This (nums[start]<=target ) only addition condition
                    if(nums[start]<=target && nums[mid]>=target){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                //Right Half
                else{
                    if(nums[end]>=target && nums[mid]<=target){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            return -1;
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int idx = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }
        //rev(nums,0,idx);
        int ans1 = binary(nums, target, 0, idx);
        int ans2 = binary(nums, target, idx + 1, nums.length - 1);
        return ans1 == -1 ? (ans2 != -1 ? ans2 : -1) : ans1;


    }

    int binary(int[] nums, int x, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
