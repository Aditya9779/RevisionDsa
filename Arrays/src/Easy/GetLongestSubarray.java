package Easy;

import java.util.HashMap;

public class GetLongestSubarray {
    public static int getLongestSubarray(int []nums,int k){
    if(nums.length==0) return 0;
    HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,len=0;
        for (int i = 0; i <nums.length ; i++) {
             sum += nums[i];
             if (sum==k){
                 len=Math.max(len,i+1);
             }
             int com=sum-k;
            if (map.containsKey(com)) {
                len=Math.max(len,i-map.get(com));
            }
            map.putIfAbsent(sum, i);
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;
        System.out.println("Length of longest subarray: " + getLongestSubarray(a, k));
    }
}
