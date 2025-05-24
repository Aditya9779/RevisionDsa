public class RemoveDuplicate {
    public static void main(String[] args) {
    RemoveDuplicate removeDuplicate=new RemoveDuplicate();
    int []nums= new int[]{1,1,2};
        System.out.println(removeDuplicate.removeDuplicates(nums));
    }
    /* Just imagine like we are filling the
     * nums[0] has already the unique value
     * but for the checking we are using to
     * target the index == from 1, so simply
     * we are checking if the next element
     * has the same value or not if not then
     * we are adding */
    public int removeDuplicates(int[] nums) {
    if (nums.length==0) return 0;
    int idx=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]!=nums[idx]){
                nums[++idx]=nums[i];
            }
        }
        return idx+1;
    
    }
}
