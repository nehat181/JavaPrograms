package random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		
		
		List<String> l2=new ArrayList<>();
		l2.add("F");
		l2.add("J");
		l2.add("A");
		l2.add("D");
		l2.add("C");
		l2.add("Z");
		l2.add("B");
		
		int s1=l1.size();
		int s2=l2.size();
		List<String> l3=new ArrayList<>();
		
		if(s1>s2){
			
			Collections.sort(l2);
			Collections.sort(l1);
			System.out.println(l2);
			System.out.println(l1);

			for(int i=0;i<s2;i++){
				
			String val=l1.get(i);
			l3.add(l1.get(i));
			
			}
			if(l3.equals(l2)){
				
				System.out.println("l2 is substring of l1");
				System.out.println(l3);
			}
		}
		
		else if(s2>s1){
			Collections.sort(l2);
			Collections.sort(l1);
			System.out.println(l2);
			System.out.println(l1);
			
			for(int i=0;i<s1;i++){
				
			String val=l2.get(i);
			l3.add(l2.get(i));
			
			}
			if(l3.equals(l1)){
				
				System.out.println("l1 is substring of l2");
				System.out.println(l3);
			}
			
			
		}
		else if(s1==s2){
			
			Collections.sort(l2);
			Collections.sort(l1);
			System.out.println(l2);
			System.out.println(l1);

			
			if(l1.equals(l2)){
				
				
				
				System.out.println("List are equal");
				
			}
		}
				System.out.println(l3);
			}
		
		
	}


