package leetCode.strings.medium;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

	public int minAddToMakeValid(String s) {
		Stack<Character> st=new Stack<>();
		int count=0;
		for(char c:s.toCharArray()) {
			if(c=='(') {
				st.add(c);
			}
			else if(c==')'&&st.size()>0) {
				st.pop();
			}
			else {
				count++;
			}

		}
		return count+st.size(); 
	}
	
	public int minAddToMakeValid1(String s) {
		int count=0;
		int min=0;
		for(char c:s.toCharArray()) {
			if(c=='(') {
				count++;;
			}
			else if(c==')') {
				if(count==0) min++;
				else
				count--;
			}
		}
		return min+count; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()))((";
		System.out.println(new MinimumAddToMakeParenthesesValid().minAddToMakeValid1(s));
	}

}
