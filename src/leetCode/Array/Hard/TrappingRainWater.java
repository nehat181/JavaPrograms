package leetCode.Array.Hard;

public class TrappingRainWater {

	public int trap(int[] height) {

		int [] left= new int[height.length];
		int [] right= new int[height.length];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++){
			max=Math.max(height[i],max);
			left[i]=max;
		}
		max=Integer.MIN_VALUE;	    
		for(int i=height.length-1;i>=0;i--){
			max=Math.max(height[i],max);
			right[i]=max;
		}
		int sum=0;
		for(int i=0;i<height.length;i++){
			sum+=Math.min(left[i], right[i])-height[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {4,2,0,3,2,5};
		System.out.println(new TrappingRainWater().trap(nums));

	}

}
