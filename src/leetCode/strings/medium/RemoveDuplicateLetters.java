package leetCode.strings.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class RemoveDuplicateLetters {

	public static String removeDuplicateLetters(String s) {

		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i), i);
		}
		boolean[] visited = new boolean[26];
		Stack<Character> st=new Stack<>();
		
		
		for(int i=0;i<s.length();i++) {
			int a=s.charAt(i) - 'a';
			boolean flag=visited[s.charAt(i) - 'a'];
			if(!flag) {
			while(!st.isEmpty()&&st.peek()>s.charAt(i)&& hm.get(st.peek())>i) {
				char rem=st.pop();
				visited[rem-'a']=false;
			}
			
			
			st.push(s.charAt(i));
			visited[s.charAt(i)-'a']=true;
			
			
		}
		}
		
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<st.size();i++) {
			ans.append(st.get(i));
		}


		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="cbacdcbc";//c-4, b-2,a-1,d-1
		String s=removeDuplicateLetters(s1);
		System.out.println(s);
	}

}
