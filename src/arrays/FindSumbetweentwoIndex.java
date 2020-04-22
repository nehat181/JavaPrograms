package arrays;

public class FindSumbetweentwoIndex {
	/*Find Sum of array between a range*/
	
	public static int sum(int [] arr,int left,int right,int n){
		int sum=0;
		
		for(int i=1;i<n;i++){
			arr[i]=arr[i-1]+arr[i];
		}
		
		sum=arr[right]-arr[left-1];
		
		
		System.out.println(sum);
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {10, 20, 10, 5, 15};
		sum(arr,1,3,arr.length);
	   
}

	
}