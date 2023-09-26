package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {

public static long maxScore(int[] nums1, int[] nums2, int k) {
	long ans=0;
	
	int[][] a= new int[nums1.length][2];
	for(int i=0;i<nums1.length;i++) {
		a[i][0]=nums1[i];
		a[i][1]=nums2[i];
	}
	Arrays.sort(a,new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return ((Integer)o2[1]).compareTo(o1[1]);
		}
	} );
	
	int min=Integer.MAX_VALUE;
	long sum=0;
	PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a1,b1)->Integer.compare(a1[0], b1[0]));
	
	for(int i=0;i<k;i++) {
		min=Math.min(min, a[i][1]);
		sum+=a[i][0];
		pq.add(a[i]);	
	}
	ans=Math.max(ans, sum*min);
	
	
	for(int i=k;i<a.length;i++) {
		if(pq.peek()[0]<a[i][0]) {
			sum-=pq.remove()[0];
			sum+=a[i][0];
			pq.add(a[i]);
			min=Math.min(min, a[i][1]);
			
		}
		ans=Math.max(ans, sum*min);
	}
	
	return ans;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1= {1,3,3,2};
		int[] nums2= {2,1,3,4};
		int k=3;
		long ans=maxScore(nums1, nums2, k);
		System.out.println(ans);
	}

}
