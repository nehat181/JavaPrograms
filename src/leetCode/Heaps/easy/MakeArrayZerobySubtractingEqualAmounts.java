package leetCode.Heaps.easy;

public class MakeArrayZerobySubtractingEqualAmounts {
	
	public int minimumOperations(int[] nums) {
	      int min=Integer.MAX_VALUE;
	      int count=0;
	      int sum=sum(nums);
	        while(sum!=0){
	         min=min(nums);
	         for(int i=0;i<nums.length;i++){
	        	 if(nums[i]==0) continue;
	             nums[i]-=min;
	         }
	         sum=sum(nums);
	         count++;
	        }
	        return count;
	    }

	    public int min(int nums[]){
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	        	if(nums[i]==0) continue;
	            min=Math.min(min,nums[i]);
	        }
	        return min;
	    }
	    
	    public int sum(int nums[]) {
	    	int sum=0;
	    	for(int i=0;i<nums.length;i++){
	        	sum+=nums[i];
	        }
	    	return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeArrayZerobySubtractingEqualAmounts ob=new MakeArrayZerobySubtractingEqualAmounts();
		int[] nums= {1,5,0,3,5};
		System.out.println(ob.minimumOperations(nums));
	}

}
