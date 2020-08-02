package leetCode;

public class RemoveKDigits {
	
	
public static String removeKdigits(String num, int k) {
	int count =0;
	int len=num.length();
	if(k==0) return num;
	if(num.length()==k) return "0";
	if(num.length()==2) {
		String A=Character.toString(num.charAt(0));
		String B=Character.toString(num.charAt(1));
		if(A.compareTo(B)>0) {
			num=num.replaceFirst(Character.toString(num.charAt(0)), "");
		}
		return num;
	}
	
	for(int i=1;i<num.length()-1;i++) {
		
	
		String A=Character.toString(num.charAt(i-1))+Character.toString(num.charAt(i));
		String B=Character.toString(num.charAt(i))+Character.toString(num.charAt(i+1));
		int val=A.compareTo(B);
		if(len>3) {
			if(A.compareTo(B)>0) {
				num=num.replaceFirst(Character.toString(num.charAt(i-1)), "");
				i--;
				count++;
				if(count==k) {
					break;
				}	
			}
		}
		else {
		if(A.compareTo(B)>0) {
		num=num.replaceFirst(Character.toString(num.charAt(i-1)), "");
		}
		else {
			num=num.replaceFirst(Character.toString(num.charAt(i+1)), "");
			
		}
		}
		
		}
		
	
	if(num.charAt(0)=='0') {
		num=num.replaceFirst(Character.toString(num.charAt(0)), "");
	}
	return num;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1173";int k = 2;
	String num1=	removeKdigits( num,  k);
	System.out.println(num1);
	}

}
