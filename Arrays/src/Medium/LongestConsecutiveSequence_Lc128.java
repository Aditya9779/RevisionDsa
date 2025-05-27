package Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence_Lc128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence_Lc128 obj = new LongestConsecutiveSequence_Lc128();
        System.out.println(obj.longestConsecutiveSequence(nums));
    }

    int longestConsecutiveSequence(int[] nums) {
        if (nums == null) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int count , ans = 0;
        /*This question has some  issue in leetCode if
         * we try to do with the forI loop then it say TimeLimitExceed*/
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                count = 0;
                int check = num;
                while (set.contains(check)) {
                    count++;
                    check++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
