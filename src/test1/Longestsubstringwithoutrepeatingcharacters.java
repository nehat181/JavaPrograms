package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Longestsubstringwithoutrepeatingcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String newStr="";
int arrCount=0;

String longestSubstring = null;

int longestSubstringLength = 0;
 
		
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		String input="GEEKSFORGEEKS";
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch=charArray[i];
		
		
		if(!(hm.containsKey(ch))){
			hm.put(ch, i);
			
			
		}
		else{
			
			i=hm.get(ch);
			hm.clear();
					
		}
		
		if(hm.size() > longestSubstringLength)
        {
            longestSubstringLength = hm.size();
             
            longestSubstring = hm.keySet().toString();
        }
    }
		
		
        
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
		
	}
		
	}


