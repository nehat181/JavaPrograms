package leetCode.Array.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueNumberofOccurrences {

	public static boolean uniqueOccurrences(int[] arr) {

		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i:arr){
			hm.put(i,hm.getOrDefault(i,0)+1);
		}

		Set<Integer> hs=new HashSet<>();
		for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
			hs.add(entry.getValue());
		}
		
		if(hs.size()==hm.size()) return true;
		
		return false;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2};
		System.out.println(uniqueOccurrences(arr));
	}

}
