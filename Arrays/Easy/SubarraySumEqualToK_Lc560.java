import java.util.HashMap;

public class SubarraySumEqualToK_Lc560 {
    public static void main(String[] args) {
        SubarraySumEqualToK_Lc560 obj=new SubarraySumEqualToK_Lc560();
        System.out.println(obj.subarraySum(new int[]{1,2,3,},3));
        System.out.println(obj.subarraySum_Best(new int[]{1,2,3,},3));
    }

    /*O(n^2)*/
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0)
            return 0;
        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /*O(n)*/
    public int subarraySum_Best(int[] nums, int k) {
        if (nums.length == 0)
            return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1); /*Very Imp*/
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int com=sum-k;
            if(map.containsKey(com)){
                count+=map.get(com);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
