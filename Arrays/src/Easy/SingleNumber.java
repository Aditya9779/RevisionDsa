package Easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length==0) return 0;
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        return xor;
    }

    public static void main(String[] args) {
        SingleNumber obj=new SingleNumber();
        int []nums=new int[]{1,2,3,3,2};
        System.out.println(obj.singleNumber(nums));
    }
}
