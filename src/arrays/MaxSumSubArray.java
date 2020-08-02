package arrays;

public class MaxSumSubArray {
	//{-2, -3, 4, -1, -2, 1, 5, -3}
   public static void maxSum(int [] arr,int n){
	   int maxSum=arr[0];
	   int CurSum=arr[0];
	   for(int i=1;i<n;i++){
		 		   
		 if(arr[i]>CurSum+arr[i])  {
			
			 CurSum=arr[i];
			 
		 }else{
			 
			 CurSum+=arr[i];
		 }
		 
		 
		 if(CurSum>maxSum){
			 
			 maxSum=CurSum;
		 }
		 
			   
	   }
	   System.out.println(maxSum);
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};//7
		//int arr[] = {-2, 2,5,-11,6};//7
		int size=arr.length;
		maxSum(arr,arr.length);
		
		
		
		}
	}


