package leetCode.Array.Medium;

import java.util.Stack;

public class StockSpanner {
	
	 Stack<int[]> st;
	    public StockSpanner() {
	        st=new Stack<>();
	     }
	    
	    public int next(int price) {
	        int ans=1;
	        while(!st.isEmpty()&&st.peek()[0]<=price){
	          ans+=st.pop()[1];
	        }
	        st.push(new int[]{price,ans});
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockSpanner ob=new StockSpanner();
		System.out.print(ob.next(100)+" ");
		System.out.print(ob.next(80)+" ");
		System.out.print(ob.next(60)+" ");
		System.out.print(ob.next(70)+" ");
		System.out.print(ob.next(60)+" ");
		System.out.print(ob.next(75)+" ");
		System.out.print(ob.next(85));
		
	}

}
