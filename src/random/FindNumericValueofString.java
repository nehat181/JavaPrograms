package random;
import java.util.HashMap;

public class FindNumericValueofString  {
	
	
 public void test(){
		
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c = "BB";

		int len=c.length();
		
		if(len<=1){
        int value = c.charAt(len-1);
        System.out.println(value-64);
		}
		
		else{
			int val1=c.charAt(len-1);
			 int value1=val1-64;
			 int val2=c.charAt(len-2);
			 int value2=val2-64;
			 int ActualVal=26+value1;
			
				 
				 System.out.println((26*value2)+value1);
				 
			 
			
			}
			
		}
        
      
        
		
	}
	
	


