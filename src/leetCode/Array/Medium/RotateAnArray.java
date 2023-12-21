package leetCode.Array.Medium;

public class RotateAnArray {

	public static void revAarr(int []arr,int start,int end){
		int low=start;
		int high=end;

		while(low<high){

			int	temp=arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
			low++;
			high--;

		}


	}




	public static void rotarr(int[] nums,int k){

		  k= k% nums.length;

		int start=0;
		int end=nums.length-1;
		while(start<end){
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		if(k>nums.length) {
			start=0;
			end=k-1;
		}
		else {
		start=0;
		end=k-1;
		}
		while(start<end&&end<nums.length){
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		start=k;
		end=nums.length-1;
		while(start<end&&start-1<nums.length){
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}


	}



	public static void main(String[] args) {

//		int arr[]={1,2};
//		int rotation=3;
		int arr[]={1,2,3};
		int rotation=4;

		rotarr(arr,rotation);

	}	

}



