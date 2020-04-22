package important;

public class ThirdHighestSalary {
	
	//{1000,3000,500,9000,2000,7000,1500,8000,2500};
	public static int findThirdHighest(int [] arr){
		int first=arr[0];
		
		int second = arr[0],third=arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>first){
				first=arr[i];
			}
			
		}
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>second&&arr[i]<first){
				second=arr[i];
			}
			}
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>third&&arr[i]<second){
				third=arr[i];
			}
			}
			
		  System.out.println(third);
		  return third;
		  
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1000,3000,500,9000,2000,7000,1500,8000,2500};//8000
		findThirdHighest(arr);
		
		
	}
	}
