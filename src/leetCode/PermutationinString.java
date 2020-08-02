package leetCode;

import java.util.ArrayList;

public class PermutationinString {
	
	 static ArrayList<String> ar=new ArrayList<>();
	
	public static void generatePermutation(String str, int start, int end) {
		char[] b = null;
		
		
		  for (int i = start; i < end; i++) {
			  String val="";
			    b =str.toCharArray();  
		        char ch;  
		        ch = b[start];  
		        b[start] = b[i];  
		        b[i] = ch; 
		        val=new String(b);
		      
		        ar.add(val);
		        
		  }
		  for (int i = 0; i < ar.size(); i++) {
			  System.out.println(ar.get(i));
		  }
		
		
		
	}
	 public static boolean checkInclusion(String s1, String s2) {
		 
		 int index=0;
		 while(index<s1.length()) {
		
			 generatePermutation(s1, index, s1.length());
			 index++;
		 
		 }
		return false;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkInclusion("abc", "eidbaooo") ;
		//abc,acb,bca,bac,cab,cbc
	}

}
