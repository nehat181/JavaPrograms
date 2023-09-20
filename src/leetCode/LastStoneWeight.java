package leetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       int start=0;
        for(int i:stones){
            pq.add(i);
        }
        if(pq.size()==1) return pq.poll();
       
               
        while(pq.size()>1) {
        	
        	int first=pq.poll();
        	int second=pq.poll();
        	if(first>second) {
        		int n=first-second;
        		pq.add(n);
        		
        	}
        	else
        		pq.add(0);
        	
        }
               	return pq.peek();
        
              
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] stones= {2,2};
int num=lastStoneWeight(stones);
System.out.println(num);
	}

}
