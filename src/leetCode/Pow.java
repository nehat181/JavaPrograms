package leetCode;

public class Pow {

	
	
public double myPow(double x, int n) {
	
	 long N = n;
     if (N < 0) {
         x = 1 / x;
         N = -N;
     }
     double result = 1;
     double currentResult = x;
     for (long i = N; i > 0; i /= 2) {
         if ((i % 2) == 1) {
             result = result * currentResult;
         }
         currentResult = currentResult * currentResult;
     }
     return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println(Math.pow(34.00515,-3));
double d=new Pow().myPow(2.0000,5);
System.out.println(d);
	}

}
