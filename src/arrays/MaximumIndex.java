package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*; 

public class MaximumIndex {

	
	public static void max(int arr[]){
		
		int max=arr[0];
		int j=0;
		
		for(int i=1;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
				j=i;
				
			}
		
		}
		System.out.println(max +" at "+(++j));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int arr[]={2,1,3,90,7,12,11,800,45};
        max(arr);
		
        
        List<Integer> list = Arrays.asList(2,1,3,90,7,12,11,100,45);
        int s=IntStream.range(0, list.size()).reduce((i,j)->list.get(i)>list.get(j)?i:j).getAsInt();
        
        System.out.println(s+1);
       
	}

}
