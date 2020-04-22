package arrays;

/*An element is leader if it is greater than all the elements to its right side*/
public class LeaderInAnArray {
	
	public static void findLead(int arr[]){
		
		//System.out.println(arr[arr.length-1]);
		int match=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--){
			
		
			if(arr[i-1]>match){
				match=arr[i-1];
				System.out.println(arr[i-1]);
				
			}
			
			
		}
		
		
		
	}
	public static void Lead(int arr[]){
		
		
	
	}
	public static void main(String[] args) {
		
		int arr[]={16, 17, 4, 3, 5, 2};
		findLead(arr);
		
		Lead(arr);
		

	}

}
