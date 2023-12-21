package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoelementSumRestOfArray {
	
	static void findpair(int arr[]){
		
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
			
		}
		
		if (sum % 2 != 0)  
        { 
            System.out.println("No pair exists");
        } 
  
        sum = sum / 2; 
		
	Arrays.sort(arr);
	
	
	
	int l=0;
	int k=arr.length-1;
	while(l<k){
		int s=arr[l]+arr[k];
	if(s==sum){
		System.out.println("pairs are"+" "+arr[l]+" and"+arr[k]);
		break;
		
	}else if(s<sum){
		l++;
		
	}
	else{
		k--;
		
	}
	
	}
	
	}
	
	
		
		public static void findpairHAshSet(int arr[],int n){
			int sum=0;
			for(int i=0;i<arr.length;i++){
				sum+=arr[i];
				
			}
			
			if(!((sum%2)==0)){
				
				System.out.println("Elements do not exist");
			}
			sum=sum/2;
			int temp;
			
			Set<Integer> set=new HashSet<Integer>(); 
			for(int i=0;i<n;i++){
				
			  temp=sum-arr[i];
			  set.add(arr[i]);
			  if(set.contains(temp)){
				  
				  System.out.println("Elements are "+arr[i]+" and"+temp);
				  
			  }
			  
				
				
			}
			
			
		}
		
		
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 11, 5, 1, 4, 7};
       //findpair(arr);
		findpairHAshSet(arr,arr.length);
       //1, 2, 3   5,4,3
	}

}
