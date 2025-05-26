package Medium;

public class StockBuyAndSell_Lc121 {
    public static void main(String[] args) {
        StockBuyAndSell_Lc121 obj = new StockBuyAndSell_Lc121();
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(obj.maxProfit(nums));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int x = Integer.MAX_VALUE, ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (x > prices[i]) {
                x = prices[i];
            } else {
                ans = Math.max(ans, prices[i] - x);
            }
        }
        return ans;
    }
}
