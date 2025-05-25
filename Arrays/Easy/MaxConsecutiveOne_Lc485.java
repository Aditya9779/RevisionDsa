public class MaxConsecutiveOne_Lc485 {
    public static void main(String[] args) {
        int []nums=new int[]{1,1,0,1,1,1};
        MaxConsecutiveOne_Lc485 obj=new MaxConsecutiveOne_Lc485();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0) return 0;
        int count=0,ans=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}
