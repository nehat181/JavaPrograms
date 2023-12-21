package strings;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.TimeZone;

import ThoughtWorks.Test;

public class ReverseSTring {
	
	public static void rev(String str,int n){
		//int n=str.length();
		//String string=str.substring(n-1);
		
		if(n>0){
			String string=str.substring(n-1,n);
			System.out.print(string);
			n--;
			rev(str,n);
			
		}
		
		
		
		
	}
	

	 

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		String s="Hello";
		rev(s,s.length());*/
		
		//System.out.println("Hello".substring(1));

		
		
		
	}
}


