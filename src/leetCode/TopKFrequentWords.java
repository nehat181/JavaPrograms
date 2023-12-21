package leetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentWords {
	
public static List<String> topKFrequent(String[] words, int k) {
     
	List<String> ans=new LinkedList<>();
	HashMap<String,Integer> freqMap=new HashMap<>();
	 for(int i=0;i<words.length;i++) {
		 freqMap.put(words[i], freqMap.getOrDefault(words[i],0)+1);
    }
	 // sort values and key in lexicographical manner
	 	 
//	 PriorityQueue<Map.Entry<String, Integer>> pq = 
//             new PriorityQueue<>((a, b) -> a.getValue() == b.getValue()
//                                ? a.getKey().compareTo(b.getKey()) 
//                                : b.getValue() - a.getValue());
	 PriorityQueue<Map.Entry<String, Integer>> pq=new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>(){

		
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
						
			if(o1.getValue()==o2.getValue())  return o1.getKey().compareTo(o2.getKey());
			else
				return o2.getValue()-o1.getValue();
		}
	});
		 
	
	 
	for(Map.Entry<String, Integer> entry: freqMap.entrySet()) {
		pq.add(entry);
		}
	
	while(k>0) {
		Map.Entry<String, Integer> entry1=pq.poll();
		ans.add(entry1.getKey());
		k--;
	}
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] inp= {"the","day","is","sunny","the","the","the","sunny","is","is"};

int k=4;
List<String> ans=topKFrequent(inp, k);
System.out.println(ans);
	}

}
