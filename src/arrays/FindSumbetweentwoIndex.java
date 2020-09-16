package arrays;

public class FindSumbetweentwoIndex {
	/*Find Sum of array between a range*/
	
	
	public static int [] pre(int [] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			arr[i]+=arr[i-1];
		}
		return arr;
		
		
	}
	public static int sum(int [] arr,int left,int right,int n){
		if(left==0) {return arr[right];}
		else {
		return arr[right]-arr[left-1];
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {10, 20, 10, 5, 15};
		 int[] pre=pre(arr);
		 int left=0;
		 int right=3;
		 
	int sum=	sum(pre,left,right,arr.length);
	System.out.println(sum);
	
	   
}

	
}