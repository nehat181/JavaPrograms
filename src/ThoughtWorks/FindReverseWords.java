package ThoughtWorks;

import java.util.HashSet;

public class FindReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [] arr= {"pat","tap","mom","cat","tac"};
	String temp="";
	HashSet<String> hs=new HashSet<String>();
	
	for(int i=0;i<arr.length;i++) {
		
		if(hs.contains(arr[i])) {
			
			System.out.println(arr[i]);
			
		}
		
		temp=new StringBuffer(arr[i]).reverse().toString();
		hs.add(temp);
		
	}
	

	}

}
