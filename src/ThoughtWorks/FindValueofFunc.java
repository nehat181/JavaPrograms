package ThoughtWorks;

public class FindValueofFunc {
	
	
	public int rec(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return rec(n-1) + rec(n-2);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input=5;
		
		System.out.println(new FindValueofFunc().rec(input));
	}

}
