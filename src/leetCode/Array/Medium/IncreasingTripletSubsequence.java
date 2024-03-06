package leetCode.Array.Medium;

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
	     int leftMin[]=new int[nums.length];
	     int rightMax[]=new int[nums.length];
	     leftMin[0]=nums[0];
	     rightMax[nums.length-1]=nums[nums.length-1];

	     for(int i=1;i<nums.length;i++){
	     leftMin[i]=Math.min(nums[i],leftMin[i-1]);
	     }

	     for(int i=nums.length-2;i>=0;i--){
	     rightMax[i]=Math.max(nums[i],rightMax[i+1]);
	     }

	      for(int i=0;i<nums.length;i++){
	     if(nums[i]>leftMin[i]&&nums[i]<rightMax[i]) return true;
	     }
	       
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {20,100,10,12,5,13};
		System.out.println(new IncreasingTripletSubsequence().increasingTriplet(nums));

	}

}
