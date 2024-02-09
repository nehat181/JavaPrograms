package leetCode.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> hm=new HashMap<>();
   	
		for(String s:strs) {
			char [] c=s.toCharArray();
			Arrays.sort(c);
			String val=String.valueOf(c);
			if(!hm.containsKey(val)) {
                hm.put(val,new ArrayList<String>());
                }
                hm.get(val).add(s);
			}
		return new ArrayList(hm.values());
		
//		 List<List<String>> li = new ArrayList<>();
//	        for(Map.Entry<String,List<String>> entry:hm.entrySet()){
//	         li.add(entry.getValue());
//	        }

		
	}

	public boolean isAnagram(String a,String b){
		int [] arr=new int[26];
		for(char c:a.toCharArray()){
			arr[c-'a']++;
		}
		if(a.length()!=b.length()) return false;
		for(char c:b.toCharArray()){
			if(arr[c-'a']==0){
				return false;
			}
			arr[c-'a']--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String []s= {"eat","tea","tan","ate","nat","bat"};
     System.out.println(new GroupAnagrams().groupAnagrams(s));
	}

}
