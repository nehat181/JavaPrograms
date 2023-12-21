package leetCode.Array.Easy;

import java.util.HashMap;

public class CountPairsWithGivenSum {
	static int getPairsCount(int[] arr, int n, int k) {
		// code here

		HashMap<Integer,Integer> hm=new HashMap<>();
		int count=0;
		for(int i=0;i<arr.length;i++){
			int temp=k-arr[i];
			if(hm.containsKey(temp)){
				count+=hm.get(temp);      
			}
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4, K = 2;
		int [] arr = {1, 1,1,1};
		System.out.println(getPairsCount(arr, N, K));

	}

}
