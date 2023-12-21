
package leetCode.Array.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Findmaximumsumsubarrayofaparticularsize{


	public static int findmaxsum(int [] arr,int sub){	
		int max=Integer.MIN_VALUE;
		int sum=0;
		int start=0;
		int end=sub;
		for(int i=0;i<sub;i++) {	
			sum+=arr[i];
		}

		while(end<arr.length) {
			max=Math.max(max,sum);

			sum-=arr[start];
			sum+=arr[end];
			start++;
			end++;
		}
		return max=Math.max(max,sum);
	}

	public static void main(String[] args) {
//		int arr1[]={2, 3, 4, 5, 7};//16
//		int k1=3;
//				int[] arr1={1, 4, 2, 10, 23, 3, 1, 0, 20};//39
//				int k1=4;
				int[] arr1={1, 8, 30, -5, 20, 7};//45
				int k1=3;

		int max=findmaxsum(arr1,k1);
		System.out.println(max);


	}	


}
