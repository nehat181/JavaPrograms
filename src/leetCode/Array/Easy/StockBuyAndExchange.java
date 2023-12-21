package leetCode.Array.Easy;

public class StockBuyAndExchange {

	public int maxProfit(int[] prices) {
		int max=Integer.MIN_VALUE;
		int [] max1=new int[prices.length];

		for(int i=prices.length-1;i>=0;i--){
			max=Math.max(prices[i],max);
			max1[i]=max;
		}
		int curr=0;
		max=Integer.MIN_VALUE; 
		for(int i=0;i<prices.length;i++){
			curr=max1[i]-prices[i];
			max=Math.max(curr,max);
		}

		return max;
	}
	
	
	public int maxProfitOptimized(int[] prices) {
		int profit=Integer.MIN_VALUE;
		int maxElement=prices[prices.length-1];
		int max=Integer.MIN_VALUE;
		for(int i=prices.length-2;i>=0;i--){
			if(prices[i]>=maxElement) {
			maxElement=prices[i];	
			}
			
			profit=maxElement-prices[i];
			max=Math.max(max, profit);
		}
		

		return max;
	}
	public static void main(String[] args) {
		int [] val={7,1,5,3,6,4};

		System.out.println(new StockBuyAndExchange().maxProfitOptimized(val));


	}

}
