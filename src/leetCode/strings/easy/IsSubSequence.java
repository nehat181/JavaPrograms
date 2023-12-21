package leetCode.strings.easy;

public class IsSubSequence {

	public boolean isSubsequence(String s, String t) {
        int ele=0;
        for(int i=0;i<s.length();i++){
            int j=ele+1;
            for(;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    ele=j+1;
                    break;
                }
            }
            
            if(j>t.length()-1){
                return false;
            }
        }
    return true;
    }
	public boolean isSubsequence1(String s, String t) {
	      int p1=0;
	      int p2=0;
	      while(p1<s.length()&&p2<t.length()){
	          if(s.charAt(p1)==t.charAt(p2)){
	              p1++;
	              p2++;
	          }
	          else{
	              p2++;
	          }
	      }
	      if(p1!=s.length()){
	          return false;
	      }
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "acb";
		String t = "ahbgdc";
		System.out.println(new IsSubSequence().isSubsequence(s, t));
	}

}
