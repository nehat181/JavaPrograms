package leetCode.strings.easy;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{
				st.push(c);
			}
			else {
				if(st.empty()) return false;
				else {
				boolean f=match(st.peek(),c);
				if(f==false) return f;
				st.pop();
				}
			}
		}
		if(!st.isEmpty()) return false;

		return true;
	}

	public static boolean match(char a, char b) {
		if(a=='(') return b==')';
		if(a=='{') return b=='}';
		if(a=='[') return b==']';
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="]";
		System.out.println(isValid(s));
	}

}
