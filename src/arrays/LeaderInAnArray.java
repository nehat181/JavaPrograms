package arrays;

/*An element is leader if it is greater than all the elements to its right side*/
public class LeaderInAnArray {
	
	public static void findLead(int arr[]){
		
		int match=arr[arr.length-1];
		System.out.println(match);
		for(int i=arr.length-2;i>=0;i--) {
			
			if(arr[i]>match) {
				
				match=arr[i];
				System.out.println(match);
				
			}
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]={16, 17, 4, 3, 5, 2};
		findLead(arr);
		
		
		

	}

}
