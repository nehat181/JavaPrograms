package leetCode.strings.easy;

import java.util.Arrays;
import java.util.Collections;

public class ReverseVowels {

	public boolean isVowel(Character c){
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			return true;
		}
		return false;
	}
	
	 public String reverseVowels(String s) {
	        int start=0;
	        int end=s.length()-1;
	        char [] c=s.toCharArray();
	        
	        while(start<end)
	        {
	            while(start<end&&!isVowel(c[start])){
	                start++;
	            }
	            while(start<end&&!isVowel(c[end])){
	                end--;
	            }

	            char temp=c[end];
	            c[end]=c[start];
	            c[start]=temp;
	            start++;
	            end--;
	        }

	            String answer = new String(c);
	            return answer;
	    }
	public String reverseVowels1(String s) {
		StringBuilder vowels=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(isVowel(c)){
				vowels.append(c);
			}
		}
		vowels.reverse();
		int count=0;
		
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(isVowel(c)) {
				ans.append(vowels.charAt(count));
				count++;
			}
			else {
				ans.append(c);
			}
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		Arrays.sort(s.toCharArray());
		System.out.println(new ReverseVowels().reverseVowels(s));
	}

}
