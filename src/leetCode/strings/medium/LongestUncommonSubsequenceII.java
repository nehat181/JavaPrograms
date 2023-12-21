package leetCode.strings.medium;

public class LongestUncommonSubsequenceII {

	public int findLUSlength(String[] strs) {

		int count=0;
		int max=0;
	
		String m="";
		if(strs[0].equals(strs[1])) 
		{
		m=strs[0];
		max=m.length();
		
		}else {
		 max=Math.max(strs[0].length(),strs[1].length());
		 m=(strs[0].length()>strs[1].length()) ? strs[0]:strs[1];
		}
		for(int i=2;i<strs.length;i++) {
			count=Math.max(m.length(),strs[i].length());
			m=(max>strs[i].length()) ? m:strs[1];
			max=Math.max(count, max);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs= {"aba","cdc","eae"};
		System.out.println(new LongestUncommonSubsequenceII().findLUSlength(strs));
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		String ca="ca";
		s1.append(ca.charAt(0));
		
		System.out.println(s1.compareTo(s2));

		System.out.println(s1);
	}

}
