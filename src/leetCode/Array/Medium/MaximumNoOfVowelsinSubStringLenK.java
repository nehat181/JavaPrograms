package leetCode.Array.Medium;

public class MaximumNoOfVowelsinSubStringLenK {

	public int maxVowels(String s, int k) {
        int start=0;
        int max=0;

        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isVowel(c)) max++;
            }
         int curr=max;
        for(int i=k;i<s.length();i++){
          char c=s.charAt(i);
          if(isVowel(c)) curr++;
          if(isVowel(s.charAt(start))) curr--;
          start++;
          max=Math.max(max,curr);
        }    
        return max;
    }

    public boolean isVowel(Character c){
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
     return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abciiidef";
		 int k = 3;
		 System.out.println(new MaximumNoOfVowelsinSubStringLenK().maxVowels(s, k));
	}

}
