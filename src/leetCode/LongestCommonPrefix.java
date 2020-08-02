package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

	
	 public static String longestCommonPrefix(String[] strs) {
		 if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		    	
		        while (strs[i].indexOf(prefix) != 0) {
		        	int c=strs[i].indexOf(prefix);
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    System.out.println(prefix);
		    
		    return prefix;
		 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String [] arr= {"aab","ab","aaba"};
		//String first=arr[0];
		//longestCommonPrefix(arr);
		
		int [] nums= {0,1,0,1,0,1,99};
		Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+3){
        	if(i==nums.length-1) {
        		System.out.println(nums[i]);
        		break;
        	}
            if(nums[i]==nums[i+2]) {
            	
            }
            else {
            	System.out.println(nums[i]);
            	break;
            }
            if(i>nums.length-2) {
            	break;
            }
        }
	}

}
