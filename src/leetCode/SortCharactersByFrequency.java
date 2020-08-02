package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortCharactersByFrequency {
	
	  public String frequencySort(String s) {
		  String output="";
			HashMap<Character,Integer> hm=new HashMap<>();
			for(int i=0;i<s.length();i++) {
				if(hm.containsKey(s.charAt(i)))
				
				{
					
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}
				
				else {
					hm.put(s.charAt(i), 1);
				}
			}
			
			Comparator<Entry<Character, Integer>> valueComparator = new Comparator<Entry<Character, Integer>>() 
			{

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					// TODO Auto-generated method stub
					int comp=o2.getValue().compareTo(o1.getValue());
					return comp;
				}
				
			};
			// Create a list from elements of HashMap 
	      
	  
				List<Entry<Character, Integer>> li=new LinkedList<Entry<Character, Integer>>(hm.entrySet());
				
				Collections.sort(li, valueComparator);
				for(Entry<Character, Integer> entry:li) {
					int val=entry.getValue();
					while(val>0) {
					output+=entry.getKey();
					val--;
					}
				}
			
		return output;
	        
	    }
	  
	  
	  
	  public String frequencySortLeet(String s) {
	      Map<Character, Integer> map = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            if (map.containsKey(c)) {
	                map.put(c, map.get(c) + 1);
	            } else {
	                map.put(c, 1);
	            }
	        }
	        
	        List<Character> [] bucket = new List[s.length() + 1];
	        for (char key : map.keySet()) {
	            int frequency = map.get(key);
	            if (bucket[frequency] == null) {
	                bucket[frequency] = new ArrayList<>();
	            }
	            bucket[frequency].add(key);
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int pos = bucket.length - 1; pos >=0; pos--) {
	            if (bucket[pos] != null) {
	                for (char num : bucket[pos]) {
	                    for (int i = 0; i < map.get(num); i++) {
	                        sb.append(num);
	                        
	                    }
	                }
	            }
	        }
	        return sb.toString();
	    
	    }
	  
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aabb";//bbAa
System.out.println(new SortCharactersByFrequency().frequencySortLeet(s));
		//char[] s1= {'H','a','n','n','a','h'};
		
	}

}
