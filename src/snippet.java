import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class A{
	public void m(){
		
		
	}
	
}
class B extends A{
	
public void m(){
		
		
	}
}



public class snippet {
	
	
	public void m(Object i)
		{
		
		System.out.println("Object");
		}
	
	public void m(String s)
	{
	
	System.out.println("String");
	}
	
	public static int i;
	//public  static Object myObj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to india";
     List<Character> ar;
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			ar=new LinkedList<Character>();
			String word=arr[i];
			for(int j=0;j<word.length();j++) {
			  ar.add(word.charAt(j));
			}
			
			
			
		Collections.sort(ar);
		for(int y=0;y<ar.size();y++) {
			System.out.print(ar.get(y));
		}
		   System.out.print(" ");
	}

		  
}
}
