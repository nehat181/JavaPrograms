package ThoughtWorks;

import java.util.HashSet;

public class SumOfTwoArrayItems {
	
	public static String find(int [] arr,int sum){ 
		String out="";
        HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i = 0; i < arr.length; ++i) { 
            int temp = sum - arr[i]; 
  
            // checking for condition 
            if (s.contains(temp)) { 
                out=String.valueOf(arr[i])+" "+String.valueOf(temp);
                   
            } 
            s.add(arr[i]); 
        } 
    
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums= {1, 4, 45, 6, 10, 8};
		int sum=16;
		System.out.println(find(nums, sum));
		
	}

}
