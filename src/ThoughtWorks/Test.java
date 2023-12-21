package ThoughtWorks;

public class Test {
	
	 public String reverseWords(String s) {
	        String arr[] = s.split(" ");
	        String out="";
	        for( int i=arr.length-1;i>=0;i--){
	            out+=arr[i]+" ";
	        }
	        return out.trim();
	    }
	
	
	public static void mains(String arg[]) {
		
		
		String s= new Test().reverseWords("a good   example");
	}

}
