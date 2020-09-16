import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class snippet{

	
	 public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	        boolean res=false;
	        if (k==0) return false;
	        if(nums.length==0||nums.length==1) return false;
	        for(int i=0;i<nums.length;i++){
	            
	            
	            for(int j=i+1;j<=i+k;j++){
	                if(j>=nums.length) break;
	                int s=nums[i]-nums[j];
	                int y=Math.abs(s);
	              if(Math.abs(s)<=t){
	                    res=true;
	               
	                }
	                
	            }
	        }
	            
	            
	            
	        
	        return res;
	        
	    }


	
	//public  static Object myObj;
	public static void main(String[] args) {
		
				
		  Deque<String> dq 
          = new ArrayDeque<String>(); 
dq.add("test");
      // add() method to insert 
      
      System.out.println(dq);
      System.out.println(dq.pop());
      System.out.println(dq);

	}
}
