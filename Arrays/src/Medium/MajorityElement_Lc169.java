package Medium;

/*Voting algorithm*/
public class MajorityElement_Lc169 {
    public static void main(String[] args) {
        MajorityElement_Lc169 obj = new MajorityElement_Lc169();
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(obj.majorityElement(nums));
    }

    int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int candidate = nums[0];
        int votes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                votes++;
            } else {
                votes--;
                if (votes == 0) {
                    candidate = nums[i];
                    votes = 1;
                }
            }
        }
        return candidate;
    }
}
