package br.com.abreu.leetcode.problems.easy;

public class maxProfit {

    public static void main(String[] args) {
        int[] prices = { 2,1,2,1,0,1,2 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
