public class FindingMissingNumber_Lc268 {
    public static void main(String[] args) {
   int []arr=new int []{3,0,1};
   FindingMissingNumber_Lc268 obj=new FindingMissingNumber_Lc268();
        System.out.println("Missing is " + obj.missingNumber(arr));
    }
    public int missingNumber(int[] nums) {
        int x=0;
        for(int i:nums){
            x+=i;
        }
        int total=(nums.length)*(nums.length+1)/2;
        return total-x;
    }
}
