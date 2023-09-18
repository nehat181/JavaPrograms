package strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	 public int lengthOfLongestSubstring(String s) {
		 
		 HashSet<Character> hm= new HashSet<Character>();
		 int max=0;
		 int start=0;int end=0;
		 while(end<s.length()) {//pwwkew
			 if(!hm.contains(s.charAt(end))) {
				 hm.add(s.charAt(end));
				 System.out.println(hm);
				 max=Math.max(max, end - start + 1);
				 System.out.println(max);
				 end++;
				 System.out.println(end);
			 }
			 else {				 
				 hm.remove(s.charAt(start));
				 start++;
				 System.out.println(start);
			 }
		 }
		 System.out.println(hm);
		 return max;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inp = "pwwkew";
		int l=new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(inp);
		System.out.println(l);
	}

}
