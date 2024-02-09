package leetCode.strings.medium;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {
	
	 public int minSteps(String s, String t) {
	        int ans=0;
	        int [] arr=new int[26];
	        for(char c:s.toCharArray()){
	            arr[c-'a']++;
	        }

	        for(char c:t.toCharArray()){
	           if(arr[c-'a']>0){
	               arr[c-'a']--;
	           }
	           else{
	               ans++;
	           }
	        }
	 return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bab";
		String t="aba";
		System.out.println(new MinimumNumberofStepstoMakeTwoStringsAnagram().minSteps(s, t));
	}

}
