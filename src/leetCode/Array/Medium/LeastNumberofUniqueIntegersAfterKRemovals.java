package leetCode.Array.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LeastNumberofUniqueIntegersAfterKRemovals {

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int num:arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
		}

		PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(hm.get(a)-hm.get(b)));
		pq.addAll(hm.keySet());

		while(k> 0) {
			int x = pq.peek();
			int count = hm.get(x);
			count--;
			if(count == 0) {
				pq.poll();
				hm.remove(x);
			} else {
				hm.put(x, count);
			}
			k--;
		}
		return hm.size();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,3,1,1,3,3,2};
		int k = 3;
		System.out.println(findLeastNumOfUniqueInts(arr, k));
	}

}
