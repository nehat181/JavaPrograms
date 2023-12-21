package leetCode.Array.Easy;

import java.util.Map;
import java.util.TreeMap;

public class MostFrequentEvenElement {
	 public int mostFrequentEven(int[] nums) {
	        TreeMap<Integer,Integer> hm=new TreeMap<Integer,Integer>();
	        int ele=-1;
	        for(int i:nums){
	            if(i%2==0){
	                hm.put(i,hm.getOrDefault(i,0)+1);
	            }
	        }

	        int curr=0;
	        int max=0;
	        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
	            curr=entry.getValue();
	            max=Math.max(curr,max);
	        }
	        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
	        	if(entry.getValue()==max) {
	            ele=entry.getKey();
	            break;
	        	}
	           
	        }
	        
	        return ele;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums= {0,0};
     System.out.println(new MostFrequentEvenElement().mostFrequentEven(nums));
	}

}
