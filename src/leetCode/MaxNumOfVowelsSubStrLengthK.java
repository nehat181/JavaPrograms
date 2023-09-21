package leetCode;

public class MaxNumOfVowelsSubStrLengthK {
	
	public int maxVowels(String s, int k) {
        int start=1;
        int n=s.length();
        int max=0;
        int count=0;

         for  (int i=0;i<k;i++){
        	int prev=s.charAt(i);
              if((prev=='a'||prev=='e'|prev=='i'||prev=='o'||prev=='u')){
                  count++;
              }
         }
         max=count;
      for(int i=k;i<n;i++){
    	   char prev=s.charAt(start-1);
    	   start++;
    	   char next=s.charAt(i);
    	   if(prev=='a'||prev=='e'|prev=='i'||prev=='o'||prev=='u') {
    		   count--;
    	   }
    	   if(next=='a'||next=='e'|next=='i'||next=='o'||next=='u') {
    		   count++;
    	   }
    	  
          max=Math.max(count,max);  
       
          }
	return max;
   
      }
    
	
	public static void main(String args[]) {
		
		String s="abciiidef"; int k=3;
		System.out.println(new MaxNumOfVowelsSubStrLengthK().maxVowels(s, k));
	}

}
