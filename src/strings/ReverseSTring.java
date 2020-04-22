package strings;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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

		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	   
	  
	   int weekday = calendar.get(Calendar.DAY_OF_WEEK);
	   
	   if (weekday != Calendar.MONDAY)
	   {
		   
	       // calculate how much to add
	       // the 2 is the difference between Saturday and Monday
		   
	       int days = (Calendar.SATURDAY - weekday + 2) %7;
	     
	       calendar.add(Calendar.DAY_OF_YEAR, days);
	       
	       // now is the date you want
		   Date date = calendar.getTime();
		   String format = new SimpleDateFormat("dd-MM-yyyy").format(date);
		   
		   System.out.println(format);
	   }
	   
	   else{
		   
		   calendar.add(Calendar.DAY_OF_YEAR, 7);
		   Date  date1 = calendar.getTime();
String format = new SimpleDateFormat("dd-MM-yyyy").format(date1);
		   
		   System.out.println(format);
		   
		   
		   
	   }
	  
	   
	   
	   
	  
		   
	   }
	/*   switch(day){
	   
	   case "Monday": 
            		   
	   
	   
	   }*/
	   
	   
		
		
	}


