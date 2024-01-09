package leetCode.Heaps.easy;

import java.util.PriorityQueue;

public class PurchaseMaxitem {

	public int purchaseMaxItem(int[] cost,int sum) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int n=cost.length;
		int res=0;
		for(int i=0;i<n;i++)
			pq.add(cost[i]);

		for(int i=0;i<n;i++){
			if(pq.peek()<=sum){
				sum-=pq.poll();
				res++;
			}else{
				break;
			}
		}
		return res;

	} 

public static void main(String[] args) {
	// TODO Auto-generated method stub

	int cost[]=new int[]{1,12,5,111,200};
	int sum=10;
	System.out.println(new PurchaseMaxitem().purchaseMaxItem(cost, sum));


}

}
