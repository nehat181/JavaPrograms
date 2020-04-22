package arrays;

public class SortWaveForm {

	
	public static void sort(int arr[]){
		
		for(int i=0;i<arr.length-2;i++){
			
			if(arr[i]<arr[i+1]){
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				
			}
			
			if((i>0)&&(arr[i]<arr[i-1])){
				
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
			i=i+1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
		sort(arr);
		
		

	}

}
