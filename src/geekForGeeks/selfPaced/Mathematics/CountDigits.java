package geekForGeeks.selfPaced.Mathematics;

public class CountDigits {
	public static int countDigit(int num) {
     int count=0;
     while(num>0) {
    	 num=num/10;
    	 count++;
     }
     
     return count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=78987121;
		System.out.println(countDigit(num));
	}

}
