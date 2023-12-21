package leetCode.Array.Medium;

import java.util.Stack;

public class OnlineStockSpan {
	public static int[] calculateSpan(int price[], int n)
	{
		// Your code here
		Stack<Integer> st=new Stack<>();
		int[] ans=new int[n];

		for(int i=0;i<n;i++){
			while(!st.isEmpty()&&price[st.peek()]<=price[i]){
				st.pop();
			}
			ans[i]=st.isEmpty()?i+1:i-st.peek();
			st.push(i);
		}
		return ans;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int size=7;
//		int [] nums= {100, 80, 60, 70, 60, 75, 85};//1 1 1 2 1 4 6
		int size=6;
		int [] nums= {10,4,5,90,120,80};//1 1 2 4 5 1
		int [] ans=calculateSpan(nums, size);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
	}

}
