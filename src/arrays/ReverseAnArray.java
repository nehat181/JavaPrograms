package arrays;

public class ReverseAnArray {
	
	public  void revarr(int arr[]){
		
		int low=0;
		int high=arr.length-1;
		
		while(low<high){
			
		int	temp=arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
			low++;
			high--;
					
		}
		int size=arr.length-1;
		int count=0;
		while(size>=0){
			
			System.out.println(arr[count]);
			count++;
			size--;
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
		
		new ReverseAnArray().revarr(arr);
		
		
		

	}

}
