package leetCode.Array.Medium;

import java.util.Stack;

public class PreviousGreaterElement {
	
	public static int[] previousGreaterElement(int [] arr) {
		int [] ans=new int[arr.length];
		ans[0]=-1;
		Stack<Integer> st=new Stack<>();
		st.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
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
		//int arr[] = {10, 4, 2, 20, 40, 12, 30};// -1,10,4,-1,-1,40,40
		//int arr[] = {10, 30,40,50};// -1,-1,-1,-1
		//int arr[] = {40,30,20,10};// -1,40,30,20
		int arr[] = {2,1,5,6,2,3};
		int [] out= previousGreaterElement(arr);
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]+",");
		}
	}

}
