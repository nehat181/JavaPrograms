package leetCode.Array.Medium;

import java.util.HashMap;

public class LargestSubarrayof0And1 {


	static int maxLen(int[] arr, int N)
	{
		// Your code here
		int sum=0;
		for(int i=0;i<N;i++) {
			if(arr[i]==0) {
				arr[i]=-1;
			}
		}
		int len=0;
		int max=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			sum+=arr[i];
			System.out.println(sum);
			if(sum==0) {
				len=i+1;
			}
			if(hm.containsKey(sum)) {
				if(len<i-hm.get(sum))
				len=i-hm.get(sum);
				
			}
				if(!hm.containsKey(sum))
				hm.put(sum, i);
			
		}
		
		
			
		return len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int [] A = {0,1,0,1};
//		int N = 5;
//		int [] A = {0,0,1,0,0};
		System.out.println(maxLen(A, N));

	}
}


