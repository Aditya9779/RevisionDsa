package Easy;

public class SingleElementInSortedArray_Lc540 {
    public static void main(String[] args) {
        System.out.println(new SingleElementInSortedArray_Lc540().singleElementInSortedArray(new int[]{1,2,2,3,3}));
    }

    int singleElementInSortedArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        //These two condition will write for
        //This thing we don't have to search in the (while function)
        //For making the readable code
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        int start=1;
        int end=nums.length-2;
        while (start<=end){
            int mid=(start+end)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            //new int[]{1,2,2,3,3} just check the index
            // 0,1,2,3,4 -- check the mid is even or odd
            //(even,odd) for the left-- mid%2==1 && nums[mid]==nums[mid-1] checking for odd
            //Then again checking for the right
            //(odd,even) for the right
            if(mid%2==1 && nums[mid]==nums[mid-1] || mid%2==0 && nums[mid]==nums[mid+1]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
