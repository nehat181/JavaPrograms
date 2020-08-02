package leetCode;

import java.util.ArrayList;

public class PerfetSquare {
	
	 public int numSquaresDP(int n) {
		 if(n <= 0){
				return 0;
			}
			
			int[] dp = new int[n+1];
			
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 3;
			
			//to compute least perfect for n we compute top down for each 
			//possible value sum from 2 to n
			for(int i = 4; i<=n; i++){
				dp[i]=i;
				//for a particular value i we can break it as sum of a perfect square j*j and 
				//all perfect squares from solution of the remainder (i-j*j)
				for(int j = 1; j*j<=i; j++){
					
					dp[i] = Math.min(dp[i], 1+dp[i-j*j]);
				}
			}
			
			return dp[n];
		 
		 
		 
	 }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int n=12;
			
		int num=	new PerfetSquare().numSquaresDP(n);
		System.out.println(num);

	}

}
