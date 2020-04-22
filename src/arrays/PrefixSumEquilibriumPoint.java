package arrays;

public class PrefixSumEquilibriumPoint {

	
	static int equilibrium(int arr[]){
		
		 int k;
		 
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			
			sum+=arr[i];
		}
		
		int lsum=0;
		
		for(k=0;k<arr.length;k++){
			sum-=arr[k];
			
			if(lsum==(sum)){
				
				
				return k;
				
			}
				else{
					
					lsum+=arr[k];		
					
				}
		}
		return -1;
		}
	
	public static void main(String[] args) {

		
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int k=new PrefixSumEquilibriumPoint().equilibrium(arr);
		 
System.out.println(k);
	}

}
