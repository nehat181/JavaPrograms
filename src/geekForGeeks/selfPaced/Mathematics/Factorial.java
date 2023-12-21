package geekForGeeks.selfPaced.Mathematics;

public class Factorial {
	static int count;
	public static long factorial(int n) {
		
		if(n==0) return 1;
		return n*factorial(n-1);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		System.out.println(factorial(num));
	}

}
