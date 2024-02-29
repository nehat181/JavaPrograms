package leetCode.strings.medium;

public class StringCompression {
	
	//{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
	public int compress(char[] chars) {//
		 int start=0;
	     int next=0;
	     int count=0;

	     while(start<chars.length){
	         char ch=chars[start];
	         count=0;
	          while(start<chars.length&&chars[start]==ch){
	              count++;
	              start++;
	          }
	          chars[next]=ch;
	          next++;
	          if(count>1){
	              String countStr=String.valueOf(count);
	              for(int i=0;i<countStr.length();i++){
	                  chars[next]=countStr.charAt(i);
	                  next++;
	              }
	          }

	     }

	        return next;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c= {'a','a','b','b','c','c','c'};
		System.out.println(new StringCompression().compress(c));

	}

}
