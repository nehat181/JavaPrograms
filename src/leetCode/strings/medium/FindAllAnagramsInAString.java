package leetCode.strings.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
	List<Integer> li=new ArrayList<>();
    boolean match(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
	
	public List<Integer> findAnagrams(String s, String p) {
		 int [] p1=new int[26];
	        int [] s1=new int[26];
	        for(int i=0;i<p.length();i++){
	            p1[p.charAt(i)-'a']++;
	            s1[s.charAt(i)-'a']++;
	        }
	        int start=0;

	        for(int i=0;i<=s.length()-p.length();i++){
	              if(match(p1,s1)) {
	               li.add(i);
	              }
	              if(i==s.length()-p.length()) break;
	              s1[s.charAt(i)-'a']--;
	              s1[s.charAt(i+p.length())-'a']++;
	        }
	        return li;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new FindAllAnagramsInAString().findAnagrams("cbaebabacd","abc");
		System.out.println(li);
	}

}
