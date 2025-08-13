package com.palle;

public class StockProfit {
	public static int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
	   int maxProfit = 0;
	
	   for (int price : prices) {
	       if (price < minPrice) {
	           minPrice = price; // Found a new minimum price
	       } else {
	           maxProfit = Math.max(maxProfit, price - minPrice); // Profit if sold today
	       }
	   }
	       return maxProfit;
	}
	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println("Maximun profit is: "+maxProfit(prices));
	}

}
