package leetCode.Array.Medium;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

	public static int lenOfLongSubarr (int A[], int N, int K) {
		//Complete the function
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int sum=0;
		int len=0;
		for(int i=0;i<N;i++){
			sum+=A[i];
			if(sum==K){
				len=i+1;
			}
			if(hm.containsKey(sum-K)){
				if (len < (i - hm.get(sum - K)))
					len = i - hm.get(sum - K);
			}
			if (!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
		}
		return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[] nums= {10, 5, 2, 7, 1, 9};
		//		int n=6;
		//		int k=15;
		int[] nums= {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
		int n=17;
		int k=15;
		System.out.println(lenOfLongSubarr(nums, n, k));
	}

}
