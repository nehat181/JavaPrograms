package ThoughtWorks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AlternateDisplayofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abc";
		String s2="xyz";
		StringBuffer out=new StringBuffer();
		
		for(int i=0;i<s1.length();i++) {
			out.append(Character.toString(s1.charAt(i))).append(Character.toString(s2.charAt(i)));
		}
		
System.out.println(out.toString());


	}

}
