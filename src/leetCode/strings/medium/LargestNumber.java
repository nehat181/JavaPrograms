package leetCode.strings.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public String largestNumber(int[] nums) {
		String [] num=new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			num[i]=String.valueOf(nums[i]);
		}
		Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				
				return (o2+o1).compareTo(o1+o2);
			}
		});
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<num.length;i++) {
			sb.append(num[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3,30,34,5,9};
		System.out.println(new LargestNumber().largestNumber(nums));
	}

}
