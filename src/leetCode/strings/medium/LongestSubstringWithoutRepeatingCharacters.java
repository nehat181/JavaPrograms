package leetCode.strings.medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {

		HashSet<Character> hm= new HashSet<Character>();

		int max=0;
		int start=0;int end=0;
		while(end<s.length()) {//pwwkew
			if(!hm.contains(s.charAt(end))) {
				hm.add(s.charAt(end));
				max=Math.max(max, end - start + 1);
				end++;
			}
			else {				 
				hm.remove(s.charAt(start));
				start++;
			}
		}
		System.out.println(hm);
		return max;
	}
	public int lengthOfLongestSubstring1(String s) {

		HashMap<Character,Integer> hm= new HashMap<>();

		int max=0;
		int start=0;int end=0;
		while(end<s.length()) {//pwwkew
			if(hm.containsKey(s.charAt(end))&&hm.get(s.charAt(end))>=start) {
				start=hm.get(s.charAt(end))+1;
			}
			else {				 
				max=Math.max(max, end-start+1);

			}
			hm.put(s.charAt(end),end);
			end++;
		}
		System.out.println(hm);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String inp = "ABCDCERYU";
		//String inp="tmmzuxt";
		String inp="abcabcbb";
		int l=new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring1(inp);
		System.out.println(l);
	}

}
