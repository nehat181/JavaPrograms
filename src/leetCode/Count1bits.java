package leetCode;

public class Count1bits {

	
	 public int hammingWeight(int n) {
	        
	        int times=32;
	        int count=0;
	        while(times>0){
	            int temp=n&1;
	            if(temp>0)
	                count++;
	            n>>=1;
	            times--;
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=new Count1bits().hammingWeight(11);
		System.out.println(c);
	}

}
