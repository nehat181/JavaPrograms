package leetCode.Array.Medium;

import java.util.Stack;

public class NextGreaterElement {

	public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
		long[] ans=new long[arr.length];
		ans[arr.length-1]=-1;
		Stack<Long> st=new Stack<>();
		st.push(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			while(!st.isEmpty()&&st.peek()<arr[i]) {
				st.pop();
			}
			ans[i]=st.isEmpty()?-1:st.peek();
			st.push(arr[i]);
		}
		
		return ans;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 4;
//		long arr[] = {1 ,3, 2, 4};//3,4,4,-1
//		int n = 5;
//		long arr[] = {6, 8, 0, 1, 3};//8,-1,1,3,-1
		int n=6;
		long arr[] = {2,1,5,6,2,3};
		long ans[]=nextLargerElement(arr, n);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+", ");
		}
		
	}

}
