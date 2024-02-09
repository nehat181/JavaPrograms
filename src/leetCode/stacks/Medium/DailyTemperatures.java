package leetCode.stacks.Medium;

import java.util.Stack;

public class DailyTemperatures {

	public int[] dailyTemperatures(int[] temperatures) {
		int [] ans=new int[temperatures.length];
		Stack<Integer> st=new Stack<Integer>();
		
		st.push(0);
		for(int i=1;i<temperatures.length;i++){
			while(st.size()>0&&temperatures[st.peek()]<temperatures[i]){
				ans[st.peek()]=i-st.peek();
				st.pop();
			}
			
			
			st.push(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperatures[] = {73,74,75,71,69,72,76,73};//[1,1,4,2,1,1,0,0]
		int [] ans=new DailyTemperatures().dailyTemperatures(temperatures);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
