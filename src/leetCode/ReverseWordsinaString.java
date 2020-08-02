package leetCode;

public class ReverseWordsinaString {

public String reverseWords(String s) {
	
	String[] arr=s.split(" ");
	StringBuffer rev = new StringBuffer();
	for(int i=arr.length-1;i>=0;i--) {
		if(!arr[i].equalsIgnoreCase("")) {
			rev.append(arr[i]+" " );
		}
		
		
	
		
	}
	
	return rev.toString().trim();
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String out=new ReverseWordsinaString().reverseWords("a good   example");

System.out.println(out);
	}

}
