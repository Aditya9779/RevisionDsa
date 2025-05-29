package Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MajorityElementII_Lc229 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        for (Integer s : Objects.requireNonNull(majorityElement(nums))) {
            System.out.print(s + "");
        }
    }

    public static List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0)
            return null;
        int can1 = 0;
        int can2 = 0;
        int check = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        //Imp for the normal voting we can take candidate and votes both
        // as 0
        int votes1 = 0, votes2 = 0;
        //For finding the two most high candidate
        for (int i : nums) {
            if (i == can1 && can1 != can2) {
                votes1++;
            } else if (i == can2 && can1 != can2) {
                votes2++;
            } else if (votes1 == 0) {
                can1 = i;
                votes1 = 1;
            } else if (votes2 == 0) {
                can2 = i;
                votes2 = 1;
            } else {
                votes1--;
                votes2--;
            }
        }
        //checking the count of that candidate
        votes1 = 0;
        votes2 = 0;
        for (int i : nums) {
            if (i == can1) votes1++;
            else if (i == can2) votes2++;
        }
        if (votes1 > check) ans.add(can1);
        if (votes2 > check) ans.add(can2);
        return ans;
    }
}
