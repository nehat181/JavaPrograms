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
	
	public int compress1(char[] chars) {
        int count=1;
        StringBuffer sb=new StringBuffer();
        char c=chars[0];
        sb.append(c);
        
        for(int i=1;i<chars.length;i++){
          if(c==chars[i]){
              count++;
          }
          else{
        	  if(count!=1) {
              sb.append(count);
        	  }
              c=chars[i];
              sb.append(c);
              count=1;
          }
        }
        if(count!=1)
        sb.append(count);
        String ans=sb.toString();
        return ans.length();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		System.out.println(new StringCompression().compress(c));

	}

}
