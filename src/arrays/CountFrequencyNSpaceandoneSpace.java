package arrays;

import java.util.HashMap;

public class CountFrequencyNSpaceandoneSpace {
	//0 space and O(1)
	
	public static void freHM(int arr[]){
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(hm.containsKey(arr[i])){
			hm.put(arr[i], hm.get(arr[i])+1);
		}
			else{
				
				hm.put(arr[i], 1);
			
			}
			}
		System.out.println(hm);
		
		
	}
	
	public static void  frequency(int [] arr, int size){
		
		for(int i=0;i<size;i++){
			
			
		}
		
		
	}
	
	//o{n) and 1 space comp
	 static void findCounts(int arr[], int n)  
    { 
			
			  for(int i=0;i<n;i++){
			  
			  int index=Math.abs(arr[i]);
			  
			  arr[index]=-arr[index]; if(arr[index]>1){
			  System.out.println("Dupicate number"+Math.abs((arr[index]))); }
			  
			  System.out.println(arr[index]);
			  
			 
			 
			  }
		 
		 
    }
    	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 3, 2, 4,4};
		findCounts(arr,arr.length);   
		//freHM(arr);
		
	

}
}
