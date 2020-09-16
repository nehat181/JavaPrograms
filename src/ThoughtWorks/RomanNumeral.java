package ThoughtWorks;

import java.util.HashMap;

public class RomanNumeral {
	
	public static void findNumeral(int num){
		
		while(num!=0){
		if(num>=1000){
			int d=num/1000;
			  num=num%1000;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("M");
			  }
			  }
		if(num>=900&&num<1000){
			int d=num/900;
			  num=num%900;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("CM");
			  }
			  }
		if(num>=500&&num<900){
			int d=num/500;
			  num=num%500;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("D");
			  }
			  }
		if(num>=400&&num<500){
			int d=num/400;
			  num=num%400;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("CD");
			  }
			  }
		
		if(num>=100&&num<400){
			int d=num/100;
			  num=num%100;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("C");
			  }
			  }
		
		if(num>=90&&num<100){
			int d=num/90;
			  num=num%90;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("XC");
			  }
			  }
		
		if(num>=50&&num<90){
			int d=num/50;
			  num=num%50;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("L");
			  }
			  }
		
		if(num>=40&&num<50){
			int d=num/40;
			  num=num%40;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("XL");
			  }
			  }
		
		if(num>=10&&num<40){
			int d=num/10;
			  num=num%10;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("X");
			  }
			  }
		
		if(num>=5&&num<9){
			int d=num/5;
			  num=num%5;
			  for(int i=1;i<=d;i++){		 
				  System.out.print("V");
			  }
	}
			  
			  if(num>=9&&num<10){
					int d=num/9;
					  num=num%9;
					  for(int i=1;i<=d;i++){		 
						  System.out.print("IX");
					  }
		}
			  
			  if(num>=4&&num<5){
					int d=num/4;
					  num=num%4;
					  for(int i=1;i<=d;i++){		 
						  System.out.print("IV");
					  }
		}
			  
			  if(num>=1&&num<4){
				  int d=num/1;
				  num=num%1;
					  for(int i=1;i<=d;i++){		 
						  System.out.print("I");
					  }
		}
			  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=221;
		
		findNumeral(num);
		
		  
		
		/*if(map.containsKey(num)||){
			
			
		}
			*/	
				
	}

}
