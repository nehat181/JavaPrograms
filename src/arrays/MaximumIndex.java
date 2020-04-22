package arrays;

public class MaximumIndex {

	
	public static void max(int arr[]){
		
		int max=arr[0];
		int j=0;
		
		for(int i=1;i<arr.length;i++){
			
			if(max<arr[i]){
				max=arr[i];
				j=i;
				
			}
			
			
		}
		System.out.println(j+1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int arr[]={2,1,3,90,7,12,11,80,45};
        max(arr);
	}

}
