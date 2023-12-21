package leetCode.Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequentElements {
	
public static int[] topKFrequent(int[] nums, int k) {
	int [] num=new int[k];
	for(int i=0;i<k;i++) {
		num[i]=0;
	}
    int start=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<nums.length;i++) {
    	 hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
    }
    
  List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());
  
  Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o2.getValue()-o1.getValue();
	}
});
  
  for(Map.Entry<Integer, Integer> e1: list) {
	  if(start==k) break;
	  num[start]=e1.getKey();
	  start++;
	  
  }

    return num;    
    }

public static int[] topKFrequentPQ(int[] nums, int k) {
	int [] num=new int[k];
	for(int i=0;i<k;i++) {
		num[i]=0;
	}
    int start=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<nums.length;i++) {
    	 hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
    }
    
 PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>(Map.Entry.comparingByKey(Collections.reverseOrder()));
   
 for(Map.Entry<Integer, Integer> e1: hm.entrySet()) {
	pq.add(e1);
	}
 
while(start<k) {
	Map.Entry<Integer, Integer> e2=pq.poll();
	num[start]=e2.getKey();
	start++;
}
  

    return num;    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] num= {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
         int k=10;
       int [] num1=topKFrequentPQ(num,k);
	}

}
