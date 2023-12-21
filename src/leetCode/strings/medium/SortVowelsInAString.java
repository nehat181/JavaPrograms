package leetCode.strings.medium;

import java.util.ArrayList;
import java.util.Collections;

public class SortVowelsInAString {
	public String sortVowels(String s) {
		char[] arr=s.toCharArray();
		int [] vow=new int[1000];
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vow[c-'A']++;
			}
		}
		
		String vowels="AEIOUaeiou";	
		int co=0;		
		StringBuffer sb=new StringBuffer(s.length());
		for(int i=0;i<arr.length;i++){
			char c=arr[i];
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
				sb.append(arr[i]);
				
			}
			else {
			while(vow[vowels.charAt(co)-'A']==0){
				co++;				
			}
			sb.append(vowels.charAt(co));
			vow[vowels.charAt(co)-'A']--;
			}
		}
		return sb.toString();
	}

	public String sortVowels1(String s) {
		char[] arr=s.toCharArray();
		ArrayList<Character> vow=new ArrayList<>();
		int count=0;
		for(int i=0;i<arr.length;i++){
			char c=arr[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				vow.add(c);
			}
		}
		Collections.sort(vow);
		StringBuffer sb=new StringBuffer(s.length());
		for(int i=0;i<arr.length;i++){
			char c=arr[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				sb.append(vow.get(count++));
			}
			else
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="lEetcOde";

		System.out.println(new SortVowelsInAString().sortVowels(s));
	}

}
