package solution;

public class BestTimeToBuyandSellStock {
	public static void main(String[] args) {
		BestTimeToBuyandSellStock obj = new BestTimeToBuyandSellStock();
		System.out.println(obj.maxProfit(new int[] {7,6,4,3,1}));
	}
	
	public int maxProfit(int[] prices) {
		int minCost = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(minCost > prices[i]) {
				minCost = prices[i];
			} 
			if(prices[i] -  minCost > maxProfit) {
				maxProfit = prices[i] - minCost;
			}
		}
		
		return maxProfit;
	}
	
}
