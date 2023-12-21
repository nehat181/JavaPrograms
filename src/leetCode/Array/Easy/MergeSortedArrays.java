package leetCode.Array.Easy;

public class MergeSortedArrays {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int last=m+n-1;
		if(m==0){
			while(n>0){

				nums1[last]=nums2[n-1];
				n--;
				last--;
			}	
			return;
		}
		while(m>0&&n>0){
			if(nums1[m-1]>nums2[n-1]) {
				nums1[last]=nums1[m-1];
				m--;
			}
			else {
				nums1[last]=nums2[n-1];
				n--;
			}
			last--;
		}
		while(n>0) {
			{
				nums1[last]=nums2[n-1];
				n--;
				last--;
			}

		}
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int [] nums1 = {1,2,3,0,0,0};
		//		int m = 3;
		//		int [] nums2 = {2,5,6};
		//		int n = 3;

		//		int [] nums1 = {2,0};
		//		int m = 1;
		//		int [] nums2 = {1};
		//		int n = 1;

		int [] nums1 = {4,5,6,0,0,0};
		int m = 3;
		int [] nums2 = {1,2,3};
		int n = 3;

		merge(nums1,m,nums2,n);
	}

}
