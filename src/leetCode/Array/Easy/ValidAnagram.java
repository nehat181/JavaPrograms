package leetCode.Array.Easy;

import java.util.Arrays;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		char [] s1=s.toCharArray();
	       char [] t1=t.toCharArray();
	       Arrays.sort(s1);
	       Arrays.sort(t1);
	      
	       if(!new String(s1).equals(new String(t1))) {
	    	   return false;
	       }
	       
	       return true;
	}
	
	public boolean isAnagram1(String s, String t) {
		int [] arr1=new int[26];
	       int [] arr2=new int[26];
	      for(int i=0;i<s.length();i++){
	          int c=s.charAt(i)-'a';
	          arr1[c]++;
	      }
	      for(int i=0;i<t.length();i++){
	          int c=t.charAt(i)-'a';
	          arr2[c]++;
	      }
	       for(int i=0;i<26;i++){
	         if(arr1[i]!=arr2[i]) return false;
	      }
	      return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rat";
		String t="car";
		ValidAnagram va=new ValidAnagram();
		System.out.println(va.isAnagram1(s, t));
	}

}
