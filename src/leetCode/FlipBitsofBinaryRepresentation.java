package leetCode;

import java.util.ArrayList;
import java.util.Stack;

/*Given a positive number,o/p=complement number
 * Eg number=5-101,complement-010==2*/
public class FlipBitsofBinaryRepresentation {
	
	public static int findCompliment(int num) {
		int output=0;
		String bin="";
		int power=0;
		int number=0;
		Stack<Character> ar=new Stack<Character>();
		
		while (!((num/2)==0)) {
			bin=String.valueOf(num%2)+bin;
			num=num/2;
	}
		if (num==1) {
			bin=1+bin;
		}
		int i=0;
		while(i<bin.length()) {
		
      
		ar.push( bin.charAt(i));
		i++;
		}
		
		while(!ar.empty()) {
			Character chars=ar.pop();
			if(chars.equals('1')) {
				chars='0';
			}
			else {
				chars='1';
			}
		    int val=Integer.parseInt(Character.toString(chars));
			number+=(int) Math.pow(2, power)*val;
			power++;
			
			
		}
		System.out.println(number);
		return output;
	
		
	}
	int output=0;
	String bin="";
	int power=0;
	int number=0;
	 public int findComplement(int num) {
     	
		Stack<Character> ar=new Stack<Character>();
		
		while (!((num/2)==0)) {
			bin=String.valueOf(num%2)+bin;
			num=num/2;
	}
		if (num==1) {
			bin=1+bin;
		}
		int i=0;
		while(i<bin.length()) {
		
   
		ar.push( bin.charAt(i));
		i++;
		}
		
		while(!ar.empty()) {
			Character chars=ar.pop();
			if(chars.equals('1')) {
				chars='0';
			}
			else {
				chars='1';
			}
		    int val=Integer.parseInt(Character.toString(chars));
			number+=(int) Math.pow(2, power)*val;
			power++;
			
			
		}
		System.out.println(number);
		return output;
	
     
 }
	
	
	public static void main(String args[]) {
	
		//findCompliment(5);
		
		int out=new FlipBitsofBinaryRepresentation().findComplement(5);
		
	}

}
