package leetCode.strings.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
	public static boolean wordBreak(String s, List<String> wordDict) {

		boolean flag=false;
		 if (s.length() == 0) {
	            return true;
	        }

		for(int i=1;i<=s.length();i++) {

			String prefix=s.substring(0,i);

			if(wordDict.contains(prefix) && wordBreak(s.substring(i),wordDict)){
				return true;
			}
              
		
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaaaa";
		List<String> wordDict=Arrays.asList("aaaa","aa");
		System.out.println(wordBreak(s,wordDict));

	}

}
