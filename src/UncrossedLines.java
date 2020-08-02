
public class UncrossedLines {
	
	public static int maxUncrossedLines(int[] A, int[] B){
		
		
		  int n = A.length;
	        int m = B.length;
	        if (n==0 || m==0) return 0;
	        
	        int[][] dp = new int[n+1][m+1];
	        for (int i = 1; i <=n; i++)
	        {
	            for (int j = 1; j <=m; j++)
	            {
	                if(A[i-1]==B[j-1]) {
	                	dp[i][j]=1+dp[i-1][j-1];
	                }
	                else {
	                	dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
	                }
	            }
	        }
	        
	        return dp[n+1][m+1];
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A[]= {1,1,2,1,2};
		int B[]= {1,3,2,3,1};
		System.out.println(maxUncrossedLines(A,B));
	}

}
