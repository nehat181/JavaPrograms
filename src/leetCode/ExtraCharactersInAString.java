package leetCode;

import java.util.HashSet;

public class ExtraCharactersInAString {

	public static int minExtraChar(String s, String[] dictionary) {
       //  StringBuffer sb=new StringBuffer();
		HashSet<String> set=new HashSet<>();
		for(String s1:dictionary) {
			
			int i=s.indexOf(s1);
			if(i>=0) {
			s=s.replaceAll(s1, "");
			
			//sb.append(s1);
			}
			
		}
		
		return s.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dwmodizxvvbosxxw";
		String [] dictionary = {"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"};
		System.out.println(minExtraChar(s, dictionary));
	}

}
