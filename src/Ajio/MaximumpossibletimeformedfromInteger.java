package Ajio;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaximumpossibletimeformedfromInteger {
	
	
	public static String findTime(int [] input){
		String ans="";
			for(int i=0;i<input.length;i++) {
				for(int j=0;j<input.length;j++) {
					for(int k=0;k<input.length;k++) {
						
						if(i==k||i==j||j==k)continue;
						int l=6-i-j-k;
						
						String h=""+input[i]+input[j];
						String m=""+input[k]+input[l];
						String time=h+":"+m;
						if(h.compareTo("24")<0&&m.compareTo("60")<0&&time.compareTo(ans)>0) {
							ans=time;
						}
						
					}
				}
				
			}
				return ans;
	}
	public static int[] etf(int n){
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=i;
        }
        for(int i=2;i<=n;i++){
          if(dp[i]==i){
              for(int j=i;j<=n;j+=i){
                  dp[j]=dp[j]-(dp[j]/i);
              }
          }
        }

        return dp;
  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] input={1,2,3,4};//1234--23:41
     System.out.println(etf(5));
     String time= findTime(input);
     System.out.println(time);
     
	}

}
