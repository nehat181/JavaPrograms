package arrays;

public class SortWaveForm {
	
	public static void sort(int arr[],int a,int b) {
		int temp=0;
		
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
		
	}

	
	public static void sort(int arr[]){
		
		for(int i=0;i<arr.length-1;i=i+2) {
			
			if(i>0&&arr[i-1]>arr[i])
			{
				sort(arr,i-1,i);
			}			
			
		
		
		if(arr[i]<arr[i+1]) {
			sort(arr,i,i+1);
			
		}
		}
		//10,5,6,3,20,2,100,80,
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20, 10, 8, 6, 4, 2};
		sort(arr);
		
		

	}

}
