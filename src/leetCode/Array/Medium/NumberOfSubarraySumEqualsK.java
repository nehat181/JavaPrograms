package leetCode.Array.Medium;

import java.util.HashMap;

public class NumberOfSubarraySumEqualsK {

	public int subarraySum1(int[] nums, int k) {
		int prefixSum=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		
		int count=0;
		for(int i=0;i<nums.length;i++) {
			prefixSum+=nums[i];
			if(prefixSum==k) {
				count++;
			}
			
			if(map.containsKey(prefixSum-k)) {
				count+=map.get(prefixSum-k);
			}
			if(map.containsKey(prefixSum))
			map.put(prefixSum,map.get(prefixSum)+1 );
			else
				map.put(prefixSum, 1);
			
			
			
			
		}
		return count;
		
	}
	
	public int subarraySum(int[] nums, int k) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int sum=0;
				int count=0;
				for(int i=0;i<nums.length;i++) {
		            sum+=nums[i];
					if(sum==k){
		                count++;   
		            }
		            
		            if(hm.containsKey(sum-k)){
		                count+=hm.get(sum-k);
		            }
		            
		                hm.put(sum,hm.getOrDefault(sum,0)+1);
		            

				}
				return count;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int [] num= {-1,-1,1};int k=0;//-1,-2,-1//     -1,1,   -2,1    
		//int [] num={1,2,3}; int k=3;// 1 2 3  [1 1][2,1] [3,1]
	     int [] num= {0,0,0};int k=0;// 0 0 0 0 0 0 0 0 0 0  [0 1]
		
	     int out=new NumberOfSubarraySumEqualsK().subarraySum(num, k);
		System.out.println(out);

	}

}
