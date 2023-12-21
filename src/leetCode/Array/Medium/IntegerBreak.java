package leetCode.Array.Medium;


public class IntegerBreak {

	public static int integerBreak(int n) {
		int ans=1;
		
		if(n==1) return 0;
		if(n==2) return 1;
		if(n==3) return 2;
          if(n%3==0) {
        	 ans*=Math.pow(3, n/3);
          }
          
          else if(n%3==1) {
        	  int z=n/3;
        	  ans*=Math.pow(3, (n/3-1))*4;
          }
          
          else if(n%3==2) {
        	  ans*=Math.pow(3,n/3)*2;
          }
        

		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(integerBreak(n));
	}

}
