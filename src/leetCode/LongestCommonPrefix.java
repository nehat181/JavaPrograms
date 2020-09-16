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
		
		String [] arr= {"aab","ab","aaba"};
		String first=arr[0];
		longestCommonPrefix(arr);
		
		
		
	}

}
