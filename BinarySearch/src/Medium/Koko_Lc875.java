package Medium;

public class Koko_Lc875 {
    public static void main(String[] args) {
        System.out.println(new Koko_Lc875().minEatingSpeed(new int[]{3,6,7,11},8));
    }
    public int minEatingSpeed(int[] piles, int h) {
        if (h == 0) return 0;
        int left=0;
        int right=getMaxPile(piles);
        while(left<=right){
            int mid=left+(right-left)/2;
            int sum = 0;
            for (int j = 0; j < piles.length; j++) {
                sum += Math.ceil((double) piles[j] / mid);
            }
            if (sum <= h) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return left;
    }
    private int getMaxPile(int[] piles) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        return maxPile;
    }
}
