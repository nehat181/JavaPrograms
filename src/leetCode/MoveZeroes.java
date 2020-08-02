package leetCode;

public class MoveZeroes {
	 public static void moveZeroes(int[] nums) {
	        int count=0;
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 if(nums[i]==0) {
				 count++;
			 }
		 }
			 for(int i=0;i<nums.length-1;i++ ) {
				 if(i==(nums.length-count)) {
					 break;
				 }
				 for(int j=i+1;j<nums.length;j++)
				 
				 if(nums[i]==0) {
					 if(nums[j]==0) {
						 
					 }
					 else {
						 int temp=nums[j];
						 nums[j]=nums[i];
						 nums[i]=temp;
						 break;
						 
					 }
					 
				 }
				 
			 }
		 
	    }
	 
	 public static void moveZeroes1(int[] nums) {
		 
	      int count = 0;  
	      int n=nums.length;
	           
	            for (int i = 0; i < n; i++) {
	                if (nums[i] != 0) {
	                    nums[count] = nums[i]; 
	                count++;
	                }
	            }
	            // Now all non-zero elements have been shifted to 
	            // front and 'count' is set as index of first 0. 
	            // Make all elements 0 from count to end. 
	            while (count < n) 
	                nums[count++] = 0; 
	            
	            for(int i=0;i<nums.length;i++){
	            	System.out.println(nums[i]);
	            }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] nums= {1,1,0,3,0};//1,1,3,0,0
     
     moveZeroes1(nums);
	}

}
