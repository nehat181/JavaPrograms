package leetCode.strings.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotateString {
	
	public boolean rotateString(String s, String goal) {
        int size=s.length()-1;
        Queue<Character> q1=new LinkedList<>();
        Queue<Character> q2=new LinkedList<>();
        for(int i=0;i<=size;i++){
            q1.add(s.charAt(i));
        }
        for(int i=0;i<goal.length();i++){
            q2.add(goal.charAt(i));
        }
        while(size>=0){
            char ele=q2.poll();
            q2.add(ele);
            if(q1.equals(q2)) {
            	return true;
            }
            size--;
            
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String goal="cdeab";
		RotateString obj=new RotateString();
		System.out.println(obj.rotateString(s, goal));
	}

}
