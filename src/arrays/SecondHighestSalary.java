package arrays;

class SecondHighestSalary {
	
	public static int findSecond(int[] arr){
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
   			if(arr[i]>first){
   				second=first;
		      first=arr[i];
			}
   			else if(arr[i]>second) {
   				second=arr[i];
   			}
		}
		
		
		
		System.out.println(second);
		return second;
	
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1000,3000,500,9200,2000,9150,6000,1500,9000,2500};
		
		findSecond(arr);

}
}
