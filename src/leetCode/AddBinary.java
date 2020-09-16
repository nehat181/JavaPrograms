package leetCode;

public class AddBinary {
	
	
	public int converttodecimal(String a) {
		int sum=0;
		for(int i=0;i<a.length();i++) {
			
			sum+=(int) (Integer.parseInt(Character.toString(a.charAt(a.length()-1-i)))*Math.pow(2, i));
		}
		
		return sum;
		
	}
	
public String addBinary(String a, String b) {
	
	int sum=0;
	String output="";
	String out="";
	
	sum=converttodecimal(a)+converttodecimal(b);
	
	
	while(sum!=0) {
		output+=String.valueOf(sum%2);
		sum=sum/2;
		
	}
	
	for(int i=output.length()-1;i>=0;i--) {
		
		out+=output.charAt(i);
	}
	
	return output;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b="0";
		
		String out=new AddBinary().addBinary(a, b);
		System.out.println(out);
		
		
		
	}

}
