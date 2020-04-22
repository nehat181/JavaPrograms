package arrays;

class SecondHighestSalary {
	
	public static int findSecond(int[] arr){
		int first=arr[0],second=arr[0];
		
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
		
		System.out.println(second);
		return second;
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1000,3000,500,9000,2000,7000,1500,8000,2500};
		findSecond(arr);

}
}
