package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
	
	  public int reverseBits(int n) {
		  int ans = 0;
		  List<Integer> l=new ArrayList<>();
	        for (int i = 0; i < 32; i++) {
	           int temp=n&1;
	           l.add(temp);
	           n>>=1;
	           
	        	
	        }
	        
	        for (int i = 0; i <32; i++) {
	        	
	        	ans<<=1;
	        	ans=l.get(i)|ans;
	        	
	        	
	        	
	        }
	        
	        
	        
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=new ReverseBits().reverseBits(11);
System.out.println(num);

	}

}
