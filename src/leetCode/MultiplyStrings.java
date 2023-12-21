package leetCode;

public class MultiplyStrings {
	public static String multiply(String num1, String num2) {
		int rem=0;
		int ans=0;
		int mul=0;
		int h=18%10;
		for(int j=num2.length()-1;j>=0;j--) {
			for(int i=num1.length()-1;i>=0;i--) {
				{
					mul=(num2.charAt(j)-'0')*(num1.charAt(i)-'0');
					rem=mul*(10*j/10);
					ans+=rem;
					

				}
			}
		}

		return null;

	}
	public static void main(String[] args) {
		String num1="123";
		String num2="456";
		multiply(num1, num2);
	}

}
