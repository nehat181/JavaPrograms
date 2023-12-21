package leetCode.strings.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateLettersFromAString {
	
	
	 public static String removeDuplicateLetters(String s) {
		String output="";
		StringBuffer out=new StringBuffer();
		HashSet<Character> hm=new HashSet<>();
		int start=0;
		for(int i=0;i<=s.length();i++) {
			if(!hm.contains(s.charAt(i))) {
				hm.add(s.charAt(i));
			}
			else
			{
				hm.remove(s.charAt(start));
			
				start++;
			}
		}
		return output;
		
	}

	public static void main(String[] args) {
		
		String input="bcabc";//abcfdabcd-abcfd,geeksforgeeks-geksfor
		removeDuplicateLetters(input);
		

	}

}
