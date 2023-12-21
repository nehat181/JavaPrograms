package leetCode.strings.easy;

import java.util.HashMap;

public class LargestSubStringBetweenTwoEqualCharacters {

	public int maxLengthBetweenEqualCharacters(String s) {
		HashMap<Character,Integer> hm=new HashMap<>();
		int max=0;
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				max=Math.max(max, i-hm.get(s.charAt(i))-1);
			}
			else {
				hm.put(s.charAt(i), i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcatb";
		System.out.println(new LargestSubStringBetweenTwoEqualCharacters().maxLengthBetweenEqualCharacters(s));
	}

}
