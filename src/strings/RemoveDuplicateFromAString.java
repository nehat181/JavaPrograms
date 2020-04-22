package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateFromAString {
	
	
	public static String removeDeplicate(String input){
		String output="";
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<input.length();i++){
			if(hm.containsKey(input.charAt(i)))
			{
				hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
			}
			else
			{
				hm.put(input.charAt(i), 1);
			}
			
			
			
		}
		
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet()){
			char c=entry.getKey();
			output+=Character.toString(c);
			
		}
		System.out.println(output);
		
		return output;
		
	}

	public static void main(String[] args) {
		
		String input="geeksforgeeks";//abcfdabcd-abcfd,geeksforgeeks-geksfor
		removeDeplicate(input);
		

	}

}
