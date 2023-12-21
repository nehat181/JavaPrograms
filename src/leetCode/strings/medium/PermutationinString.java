package leetCode.strings.medium;

import java.util.Arrays;

public class PermutationinString {

	boolean flag=false;
	public boolean checkInclusion(String s1, String s2) {
		int[] arr1=new int[26];
		int [] arr2=new int[26];
		int start=s1.length();
		for(int i=0;i<s1.length();i++) {
			int index=s1.charAt(i)-'a';
			arr1[index]++;
		}		
		for(int i=0;i<s1.length();i++) {
			int index=s2.charAt(i)-'a';
			arr2[index]++;
		}
		
	    for(int i=0;i<s2.length()-s1.length();i++) {
	    	if(matches(arr1, arr2)) {
	    		return true;
	    	}
	    	
	    	//dcda
	    	arr2[s2.charAt(i)-'a']--;
	    	arr2[s2.charAt(i+start)-'a']++;
	    	
	    	
	   		
	    	
	    	}
		
		return matches(arr1, arr2);
	}


	public boolean checkInclusion1(String s1, String s2) {
		int [] arr1=new int[26];


		for(int i=0;i<s1.length();i++) {
			int index=s1.charAt(i)-'a';
			arr1[index]++;
		}
		//eidbaooo
		for(int i=0;i<s2.length()-s1.length();i++) {
			int [] arr2=new int[26];
			for(int j=0;j<s1.length();j++) {
				arr2[s2.charAt(i+j)-'a']++;
			}

			if (matches(arr1, arr2))
				return true;
		}
		return false;
	}

	public boolean matches(int[] s1map, int[] s2map) {
		for (int i = 0; i < 26; i++) {
			if (s1map[i] != s2map[i])
				return false;
		}
		return true;
	}
	public boolean checkInclusion2(String s1, String s2) {
		s1 = sort(s1);
		for (int i = 0; i <= s2.length()-s1.length(); i++) {
			String val=s2.substring(i, i + s1.length());
			System.out.println(val);
			System.out.println("Sorted: "+sort(val));
			if (s1.equals(sort(val)))
				return true;
		}
		return false;
	}

	public String sort(String s) {
		char[] t = s.toCharArray();
		Arrays.sort(t);
		return new String(t);
	}

	/* Time comp-O(N!) */
	public boolean checkInclusion3(String s1, String s2) {

		perm(s1,s2,0);
		return flag;
	}
	public void perm(String s1, String s2, int l) {
		if(l==s1.length()){
			if(s2.indexOf(s1)>=0){
				flag=true;  
			}
		}
		else
			for(int i=l;i<s1.length();i++){
				s1= swap(s1,l,i);
				perm(s1,s2,l+1);
				s1=swap(s1,l,i);
			}
	}

	public static String swap(String s, int i,int j){
		char temp=s.charAt(i);
		char[] ans= s.toCharArray();
		ans[i]=s.charAt(j);
		ans[j]=temp;
		return String.valueOf(ans);
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PermutationinString().checkInclusion("abc","cbaebabacd") );
		//abc,acb,bca,bac,cab,cbc
	}

}
