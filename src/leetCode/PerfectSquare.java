package leetCode;

import java.util.HashMap;
import java.util.Map;

public class PerfectSquare {
	
public static boolean isPerfectSquare1(int num) {
	int sum=1;
	if(num==1) return true;
	
	for(int i=3;i<num;i++) {
		sum+=i;
		if(sum==num) {
			return true;
			
		}
		i++;
		
		
	}
	return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=isPerfectSquare1(1);
		System.out.println(flag);
	}

}
