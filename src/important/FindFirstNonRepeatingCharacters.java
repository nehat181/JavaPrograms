package important;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindFirstNonRepeatingCharacters {

	
	
	public static Character findValue(String s){
		Character output = null;
		Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			    }
			else{
				hm.put(s.charAt(i),0);
				}
			}	
		
		for(Map.Entry<Character,Integer> entry:hm.entrySet()){
	        if(entry.getValue()==0){
	        	output=entry.getKey();
	        	break;
	   	        }
	          
	   }
		System.out.println(output);
		return output;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="GttGeeks";
		findValue(input);
		
		
		
	}

}
