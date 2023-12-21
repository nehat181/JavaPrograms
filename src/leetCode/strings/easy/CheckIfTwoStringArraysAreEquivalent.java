package leetCode.strings.easy;

public class CheckIfTwoStringArraysAreEquivalent {

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		int p1=0;
		int p2=0;
		int arrLen1=0;
		int arrLen2=0;
		while(arrLen1<word1.length&&arrLen2<word2.length){

			if(word1[arrLen1].charAt(p1)!=word2[arrLen2].charAt(p2)){
				return false;
			}
			p1++;
			p2++;
			if(p1==word1[arrLen1].length()){
				arrLen1++;
				p1=0;
			}
			if(p2==word2[arrLen2].length()){
				arrLen2++;
				p2=0;
			}
		}

		if(arrLen1!=word1.length||arrLen2!=word2.length) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1= {"abc","d","defg"};
		String[] word2= {"abcddef"};
		System.out.println(new CheckIfTwoStringArraysAreEquivalent().arrayStringsAreEqual(word1, word2));
		char c1='1';
		char c2='a';
	}

}
