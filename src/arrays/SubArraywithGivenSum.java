package arrays;

public class SubArraywithGivenSum {

	
	  
	    static int subArraySum(int arr[], int n, int sum)  
	    { 
	        int curr_sum = arr[0], start = 0, i; 
	  
	        // Pick a starting point 
	        for (i = 1; i <= n; i++)  
	        { 
	            // If curr_sum exceeds the sum, then remove the starting elements 
	            while (curr_sum > sum ) 
	            { 
	                curr_sum = curr_sum - arr[start]; 
	                start++; 
	            } 
	              
	            // If curr_sum becomes equal to sum, then return true 
	            if (curr_sum == sum)  
	            { 
	                int p = i-1; 
	                System.out.println("Sum found between indexes " + start 
	                        + " and " + p); 
	                return 1; 
	            } 
	              
	            // Add this element to curr_sum 
	            if (i < n) 
	            curr_sum = curr_sum + arr[i]; 
	              
	        }
	        
	        
	  
	        System.out.println("No subarray found"); 
	        return 0; 
	    } 
	  
	  public static void findSub(int[] arr,int size,int sum ){
		  //{15, 2, 4, 8, 9, 5, 10, 23}
		  int currsum=0;
		  int start=0;
		  int end=0;
		  
			  
			  while(currsum<=sum){
				  
				  if(end<size){
			        currsum+=arr[end];
			        end++;
				  }
				  
			  if(currsum==sum){
				  System.out.println("Start index "+start);
				  System.out.println("End index "+(end-1));
				  break;
				  }
			  else{
				  
				  while (currsum>sum){
					  currsum-=arr[start];
					  start++;
					  
				  
				  }
				  
				  
				  }
			  }
	  }
			  
			  
		  
		  
		  
		  
	  
	    
	    
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
	        int nums[] = {1,2,3}; 
	        int k=3;
//	        int n = arr.length; 
//	        int sum = 33; 
//	        findSub(arr,n,sum);
	     //   arraysum.subArraySum(arr, n, sum); 
	        
	        
	        
	        int sum=0;
	        
	        int count=0;
	        int start=0;
	        int end=0;
	             
	        while(end<nums.length){
	        	
	        	if(nums[end]==k) {
	        		
	        		start++;
	        		count++;
	        		end++;
	        		}
	        	
	        	if(end>nums.length-1) break;
	        	sum+=nums[end];
	        	if(sum==k) {
	        		count++;
	        		sum-=nums[start];
	        		start++;
	        		
	        		
	        		
	        	}
	        	end++;
	        	
	        	
	        	
	        	
	        	}
	        	
	        	
	      
	      
	        System.out.println(count);
	        
	       
}
}
