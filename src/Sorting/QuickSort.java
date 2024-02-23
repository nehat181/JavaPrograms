package Sorting;

public class QuickSort {

	public void quickSort(int arr[],int low,int high) {
		
		if(low<high) {
			int pi=partition(arr, low, high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
		}


	public int partition(int arr[],int low,int high) {

		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}

		}
		swap(arr,i+1,high);
		return i+1;
	}

	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0,1,1,2,0,5};
		new QuickSort().quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
