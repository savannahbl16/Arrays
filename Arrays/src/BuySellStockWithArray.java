/**Say you have an array prices for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 (i.e., buy one and sell one share of the stock multiple times).

 Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before
 you buy again). **/

public class BuySellStockWithArray {
    public int maxProfit(int[] prices) {
        int i = 0;
        boolean canSell = false;
        boolean canBuy = true;
        int buyPrice = 0;
        int sellPrice;
        int profit = 0;
        // iterate through array
        while (i < prices.length) {
            //if element is less than the next one and we are allowed to, buy!
            //if element is greater than the next one and we are allowed to, sell!
            //otherwise increment index
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
                //when we sell, add current profit to total profit
                profit += sellPrice - buyPrice;
            } else {
                i++;
            }
        }
        return profit;
    }
}
