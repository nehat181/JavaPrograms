package leetCode.Array.Medium;

public class MinimumTimeToMakeRopeColorful {

	 public int minCost(String colors, int[] neededTime) {
	        int res=0;
	        int compTime=neededTime[0];
	        for(int i=1;i<colors.length();i++){

	            if(colors.charAt(i)==colors.charAt(i-1)){
	            	
	                res+=Math.min(neededTime[i],compTime);
	                compTime=Math.max(compTime,neededTime[i]);
	            }
	            
	            else{
                    compTime=neededTime[i];
                }
	            
	             
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr= "aaaaaaaaaaaaaa";
       int [] cost= {1,3,6,5,4,5,4,4,2,8,3,10,6,6};
       System.out.println(new MinimumTimeToMakeRopeColorful().minCost(arr, cost));
       
	}

}
