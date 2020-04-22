package arrays;

import java.util.ArrayList;

public class MaxAppearingElementInTheRange {
	
	int max(int left[],int right[],int n){
		ArrayList<Integer> ar=new ArrayList<Integer>(8);
		
		for(int i=0;i<n;i++){
			
			ar.add(left[i],ar.get(left[i])+1);
			ar.add(right[i]+1,ar.get(right[i]+1));
			
		}
		
		int max=ar.get(0);
		for(int i=1;i<ar.size();i++ )
		{
			int val=ar.get(i);
			ar.add(i,val+ar.get(i-1));
			
		}		
		
		return n;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int left[]={1,2,3};
		int right[]={3,5,7};
		
		
int k=new MaxAppearingElementInTheRange().max(left, right, 9);
System.out.println(k);
	}

}
