package Easy;

public class PeakElement_Lc162 {
    public static void main(String[] args) {
        System.out.println(new PeakElement_Lc162().findPeakElement(new int[]{1,2,3,1}));
    }
    public int findPeakElement(int[] nums) {
        if(nums.length==0) return -1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //Imp check for the left element is smaller
            boolean left=(mid==0) || (nums[mid]>nums[mid-1]);
            //Imp check for the right element is smaller
            boolean right=(mid==nums.length-1) || (nums[mid]>nums[mid+1]);
            if(left && right) return mid;
            else if(left){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
