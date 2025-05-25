package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
    int []arr=new int[]{1,2,4,5};
    int target=3;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
     if(nums.length == 0) {
         return new int[0];
     }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
             int complement=nums[i]-target;
            if (map.containsKey(complement)){
               return new int[]{i, map.get(complement)};
            }
            map.put(nums[i],i);
        }
     return new int[0];
    }
}