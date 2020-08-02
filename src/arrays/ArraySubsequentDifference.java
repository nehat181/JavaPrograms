package arrays;

public class ArraySubsequentDifference {
	
	
	public static boolean sub(int [] arr) {
		
		int prev=(Math.abs(arr[1]-arr[0]));
		int curr=0;
		
		for(int i=2;i<arr.length;i++) {
			
			if((Math.abs(arr[i]-arr[i-1]))!=prev) {
				return false;
			}
			
			
			
		}
		return true;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {5,10,15,20,25};
		//System.out.println(sub(arr));;
		int num=109;
		 
		if (num == 0) {
			System.out.println(0);
		};
        if (num % 9 == 0) {
        	
        	System.out.println(9);
        }
        System.out.println(num % 9);
        }
        
        
        
      
	

	
}
