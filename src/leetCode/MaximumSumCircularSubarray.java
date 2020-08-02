package leetCode;

public class MaximumSumCircularSubarray {
	static int maxCircularSum (int a[]) 
    { 
        int n = a.length; 
  
        // Case 1: get the maximum sum using standard kadane' 
        // s algorithm 
        int kad = kadane(a); 
        int total=0;
        for(int i=0;i<a.length;i++) {
        	total+=a[i];
        	a[i]=-a[i];
        }
        int min=kadane(a);
        
        total=total+min;
        if(total==0)return kad;
        
        return kad>total?kad:total;
        
    } 
  
    // Standard Kadane's algorithm to find maximum subarray sum 
    // See https://www.geeksforgeeks.org/archives/576 for details 
    static int kadane (int arr[]) 
    { 
    	int n=arr.length;
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
        return maxSum; 
    } 
  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {-2,-3,-1};
		int val=maxCircularSum(A);
		System.out.println(val);
		
	
		}
	}


