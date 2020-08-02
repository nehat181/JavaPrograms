package arrays;

public class RotateAnArray {
	
	public static void revAarr(int []arr,int start,int end){
		int low=start;
		int high=end;
		
		while(low<high){
			
		int	temp=arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
			low++;
			high--;
					
		}
		
		
	}
	
	
	
	
	public static void rotarr(int[] arr,int rot){
		
		int start=0;
		int end=rot-1;
		
		revAarr(arr,start,end);
		start=rot;
		end=arr.length-1;
		revAarr(arr,start,end);
		
		start=0;
		end=arr.length-1;
		revAarr(arr,start,end);
		
		
		
		while(end>=0){
			
			System.out.println(arr[start]);
			start++;
			end--;
			
		}
		
	
		
	}
	
	
	
public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7};
		int rotation=2;
		
		rotarr(arr,rotation);
	    
}	

}

 

