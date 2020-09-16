package ThoughtWorks;

import java.util.HashSet;

public class CountofsubstringscontainingcharacterXatleastonce {
	
	
	static int countSubStr(String str, int n, char x) 
	{ 
	    int res = 0, count = 0; 
	    for (int i = 0; i < n; i++) 
	    { 
	        if (str.charAt(i) == x) 
	        { 
	  
	            // Number of sub-strings from position 
	            // of current x to the end of str 
	            res += ((count + 1) * (n - i)); 
	  
	            // To store the number of characters 
	            // before x 
	            count = 0; 
	        } 
	        else
	            count++; 
	    } 
	  
	    return res; 
	} 
	  

	public static void main(String[] args) {
		 String str = "geeksforgeeks"; 
		    int n = str.length(); 
		    char x = 'e'; 
		  
		    System.out.println(countSubStr(str, n, x)); 
		    
		    
	}

}
