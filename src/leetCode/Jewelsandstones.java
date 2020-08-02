package leetCode;

import java.util.HashMap;

public class Jewelsandstones {
	
public static int numJewelsInStones(String J, String S) {
	int count=0;
	
	HashMap<Character,Integer> hm=new HashMap<>();
	
	for(char val:S.toCharArray()) {
       if(hm.containsKey(val)) {
			
			hm.put(val, hm.get(val)+1);
		}
       else {
		
        
			hm.put(val, 1);
       }
		}
		
	for(char val:J.toCharArray()) {
		
		if(hm.containsKey(val)) {
			
			count+=hm.get(val);
		}
	}
	
	
	return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numJewelsInStones("aA", "aAAbbbb");
	}

}
