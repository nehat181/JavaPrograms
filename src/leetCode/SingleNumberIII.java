package leetCode;

public class SingleNumberIII {
	
	 public int[] singleNumber(int[] nums) {
	  
	        int [] output=new int [2];
	        int xor=0;
	        for(int i=0;i<nums.length;i++) {
	        	 xor ^= nums[i];
	        }
	        
	        int first=xor&(-xor);
	        
	        for(int i=0;i<nums.length;i++) {
	        	
	        	if((nums[i]&first)>0) {
	        		output[0]^=nums[i];
	        		
	        		
	        	}
	        	else {
	        		output[1]^=nums[i];
	        	}
	        }
	       
	        
	        
	       return output; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,1,3,2,5};
		
		int [] out=new SingleNumberIII().singleNumber(arr);
		
		for(int i=0;i<out.length;i++) {
			System.out.println(out[i]);
		}

	}

}
