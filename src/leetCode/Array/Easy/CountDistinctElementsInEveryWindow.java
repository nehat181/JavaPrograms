package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class CountDistinctElementsInEveryWindow {

	ArrayList<Integer> countDistinct(int A[], int n, int k)
	{
		// code here 
		ArrayList<Integer> ar=new ArrayList<>();
		int start=0;
		int end=0;
		HashMap<Integer,Integer> hs=new HashMap<>();
		//hs.put(A[0],1);
		while(end<n){

			hs.put(A[end],hs.getOrDefault(A[end], 0)+1);



			if(end-start==k-1){


				ar.add(hs.size());
				if(hs.get(A[start])-1==0) {
					hs.remove(A[start]);
				}
				else
					hs.put(A[start],hs.get(A[start])-1);
				start++;




			}
			end++;
		}
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] A = {1,2,1,3,4,2,3};
//		int N = 7; int K = 4;
		int [] A = {73};
		int N = 1; int K = 1;
		System.out.println(new CountDistinctElementsInEveryWindow().countDistinct(A, N, K));
	}

}
