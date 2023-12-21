package leetCode.Array.Easy;

public class MaximumDifferenceBetweenIncreasingElement {
	public int maximumDifference(int[] nums) {

		int max=Integer.MIN_VALUE;
		int maxEle=nums[nums.length-1];
		int curr=Integer.MIN_VALUE;
		
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]<maxEle){  
				
				curr=maxEle-nums[i];
			}
			else {
				
				maxEle=nums[i];
				curr=0;
				
				
			}
			max=Math.max(max, curr);
			
		}
		
		
		if(max==0) return -1;
		return max;
	}
	
	public int maximumDifference1(int[] nums) {
		int [] maxNums=new int[nums.length];
		int max=nums[nums.length-1];
		maxNums[nums.length-1]=max;

		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]>max){  
				max=nums[i];
			}
			maxNums[i]=max;
		}
		max=Integer.MIN_VALUE;
		int curr=maxNums[0]-nums[0];
		for(int i=1;i<nums.length;i++){
			max=Math.max(max,curr);
			curr=maxNums[i]-nums[i];
		}
		if(max==0) return -1;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {9,4,3,2};
		System.out.println(new MaximumDifferenceBetweenIncreasingElement().maximumDifference(nums));
	}

}
