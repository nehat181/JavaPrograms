package leetCode.Array.Medium;

public class BestTimeToBuyAndSellStockII {

	public int maxProfit(int[] prices) {
		int profit=0;

		for(int i=0;i<prices.length-1;i++){
			if(prices[i]<prices[i+1]){
				profit+=prices[i+1]-prices[i];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {7,1,5,3,6,4};
		System.out.println(new BestTimeToBuyAndSellStockII().maxProfit(prices));
	}

}
