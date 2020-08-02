package leetCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingCharIndex {
	
	public static int findIndex(String s) {
		
		int index=0;
		Character value = null;
		if(s.equalsIgnoreCase("")) {
			index=-1;
		}
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
		if(hm.containsKey(s.charAt(i))) {
			
			hm.put(s.charAt(i), hm.get(s.charAt(index))+1);
			
		}
		else {
			
			hm.put(s.charAt(i), 1);
		}
		
		}
		
		for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
			if(entry.getValue()==1) {
				value=entry.getKey();
				break;
			}
			
		}
		
		try {
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==value) {
				index=i;
				break;
			}
		}
		}
		catch(NullPointerException e) {
			index=0;
			
		}
			
	

		
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findIndex("ccrr");

	}

}
