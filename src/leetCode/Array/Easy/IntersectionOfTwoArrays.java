package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> hs=new HashSet<>();
		ArrayList<Integer> ans=new ArrayList<>();

		for(int i:nums1){
			hs.add(i);
		}
		for(int i:nums2){
			if(hs.contains(i)){
				ans.add(i);
				hs.remove(i);
			}
		}
		int[] arr = new int[ans.size()];
		for (int i= 0; i < ans.size(); i++)
		{ arr[i] = ans.get(i);
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2,2,1}, nums2 = {2,2};
		System.out.println(new IntersectionOfTwoArrays().intersection(nums1, nums2));
	}

}
