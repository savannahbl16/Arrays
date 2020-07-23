public class BuySellStockWithArray {
    public int maxProfit(int[] prices) {
        int i = 0;
        boolean canSell = false;
        boolean canBuy = true;
        int buyPrice = 0;
        int sellPrice;
        int profit = 0;
        while (i < prices.length) {
            if (i != prices.length - 1 && prices[i] < prices[i+1] && canBuy) {
                buyPrice = prices[i];
                canSell = true;
                canBuy = false;
                i++;
                System.out.println("buying: " + i);
            } else if ((i == prices.length - 1 || prices[i] > prices[i+1])  && canSell) {
                sellPrice = prices[i];
                canSell = false;
                canBuy = true;
                i++;
                System.out.println("selling: " + i);
                profit += sellPrice - buyPrice;
            } else {
                i++;
            }
        }
        return profit;
    }
}
