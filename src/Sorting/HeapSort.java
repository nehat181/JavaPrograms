package Sorting;

public class HeapSort {
	
	public void buildheap(int arr[],int n) {
		for (int i = n / 2 - 1; i >= 0; i--) 
		    heapify(arr, n, i);
    }
	
	
	
	public void sort(int arr[]) 
	{ 
		int n = arr.length; 

		buildheap(arr,n); 
 
		for (int i=n-1; i>0; i--) 
		{ 
			 
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 

			heapify(arr, i, 0); 
		} 
	} 
	
	public void heapify(int arr[],int n,int i)
	{
		int largest = i;  
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		if (l < n && arr[l] > arr[largest]) 
			largest = l; 
 
		if (r < n && arr[r] > arr[largest]) 
			largest = r; 

		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			heapify(arr, n, largest); 
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,10,3,5,1,11,13}; 
		int n = arr.length; 
		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
