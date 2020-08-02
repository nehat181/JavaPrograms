package leetCode;
/*class TrieNode{
	
	TrieNode[] characters=new TrieNode[26];
	int isEnd=0;
	
}

class Trie{
	
	static TrieNode root;
	public Trie() {
		root=new TrieNode();
		
	}
	
	
	public String insert(String word) {
		TrieNode node=root;
		String sb = "";
		for(char c:word.toCharArray()){
			int index=c-'a';
					
			if(node.characters[index]==null) {
				node.characters[index]=new TrieNode();
				node=node.characters[index];
			}
			else {
				
				sb+=Character.toString(c);
				
				node=node.characters[index];
				
			}
			
			
		node.isEnd=1;
		}
		if(sb.length()==word.length()) return sb;
		else {return "";}
		
		
	}
	
}*/

public class LongestDuplicateSubstring {
	/*
	 * Trie obj;
	 * 
	 * 
	 * public String longestDupSubstring(String S) { String output = ""; String
	 * max=""; int start=0; int end=S.length()-1; int low=1; int high=S.length();
	 * 
	 * 
	 * int mid=(low+high)/2;
	 * 
	 * 
	 * 
	 * 
	 * obj=new Trie(); for(int i=start;i<end;i++) {
	 * 
	 * if(mid-start<0||(start+mid)>S.length()) break;
	 * 
	 * 
	 * output=obj.insert(S.substring(start, start+mid)); start++;
	 * 
	 * 
	 * 
	 * } if(output.length()>max.length()) { max=output; } start=0;
	 * if(max.equalsIgnoreCase("")) {
	 * 
	 * high=mid-1; mid=(low+high)/2; } else {
	 * 
	 * } mid++;
	 * 
	 * 
	 * 
	 * 
	 * System.out.println(max);
	 * 
	 * return max;
	 * 
	 */	
	String S="";
	public String longestDupSubstring(String S) {
	    this.S = S;
	    int maxLo = 0, maxLength = 0;
	    TrieNode root = new TrieNode(0, 0);
	    for (int i = 1; i + maxLength < S.length(); i++) {
	        int len = addNew(root, i);
	        if (len > maxLength) {
	            maxLength = len;
	            maxLo = i;
	        }
	    }
	    return S.substring(maxLo, maxLo + maxLength);
	}

	private boolean isLeaf(TrieNode node) {
	    return node.next == null;
	}

	private int getIndex(int i, int depth) {
	    return S.charAt(i + depth) - 'a';
	}

	private int addNew(TrieNode node, int i) {
	    int depth = node.depth;
	    if (i + depth == S.length()) return depth;
	    if (isLeaf(node)) {
	        node.next = new TrieNode[26];
	        node.next[getIndex(node.i, node.depth)] = new TrieNode(node.i, depth + 1);
	    }
	    int c = getIndex(i, node.depth);
	    TrieNode x = node.next[c];
	    if (x == null) {
	        node.next[c] = new TrieNode(i, depth + 1);
	        return depth;
	    }
	    return addNew(x, i);
	}

	private static class TrieNode {
	    private TrieNode[] next;
	    private int i;
	    private int depth;

	    public TrieNode(int i, int depth) {
	        this.i = i;
	        this.depth = depth;
	    }
	}	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestDuplicateSubstring ob=new LongestDuplicateSubstring();
		String s=ob.longestDupSubstring("banana");
		System.out.println(s);
		//ob.longestDupSubstring("moplvidmaagmsiyyrkchbyhivlqwqsjcgtumqscmxrxrvwsnjjvygrelcbjgbpounhuyealllginkitfaiviraqcycjmskrozcdqylbuejrgfnquercvghppljmojfvylcxakyjxnampmakyjbqgwbyokaybcuklkaqzawageypfqhhasetugatdaxpvtevrigynxbqodiyioapgxqkndujeranxgebnpgsukybyowbxhgpkwjfdywfkpufcxzzqiuglkakibbkobonunnzwbjktykebfcbobxdflnyzngheatpcvnhdwkkhnlwnjdnrmjaevqopvinnzgacjkbhvsdsvuuwwhwesgtdzuctshytyfugdqswvxisyxcxoihfgzxnidnfadphwumtgdfmhjkaryjxvfquucltmuoosamjwqqzeleaiplwcbbxjxxvgsnonoivbnmiwbnijkzgoenohqncjqnckxbhpvreasdyvffrolobxzrmrbvwkpdbfvbwwyibydhndmpvqyfmqjwosclwxhgxmwjiksjvsnwupraojuatksjfqkvvfroqxsraskbdbgtppjrnzpfzabmcczlwynwomebvrihxugvjmtrkzdwuafozjcfqacenabmmxzcueyqwvbtslhjeiopgbrbvfbnpmvlnyexopoahgmwplwxnxqzhucdieyvbgtkfmdeocamzenecqlbhqmdfrvpsqyxvkkyfrbyolzvcpcbkdprttijkzcrgciidavsmrczbollxbkytqjwbiupvsorvkorfriajdtsowenhpmdtvamkoqacwwlkqfdzorjtepwlemunyrghwlvjgaxbzawmikfhtaniwviqiaeinbsqidetfsdbgsydkxgwoqyztaqmyeefaihmgrbxzyheoegawthcsyyrpyvnhysynoaikwtvmwathsomddhltxpeuxettpbeftmmyrqclnzwljlpxazrzzdosemwmthcvgwtxtinffopqxbufjwsvhqamxpydcnpekqhsovvqugqhbgweaiheeicmkdtxltkalexbeftuxvwnxmqqjeyourvbdfikqnzdipmmmiltjapovlhkpunxljeutwhenrxyfeufmzipqvergdkwptkilwzdxlydxbjoxjzxwcfmznfqgoaemrrxuwpfkftwejubxkgjlizljoynvidqwxnvhngqakmmehtvykbjwrrrjvwnrteeoxmtygiiygynedvfzwkvmffghuduspyyrnftyvsvjstfohwwyxhmlfmwguxxzgwdzwlnnltpjvnzswhmbzgdwzhvbgkiddhirgljbflgvyksxgnsvztcywpvutqryzdeerlildbzmtsgnebvsjetdnfgikrbsktbrdamfccvcptfaaklmcaqmglneebpdxkvcwwpndrjqnpqgbgihsfeotgggkdbvcdwfjanvafvxsvvhzyncwlmqqsmledzfnxxfyvcmhtjreykqlrfiqlsqzraqgtmocijejneeezqxbtomkwugapwesrinfiaxwxradnuvbyssqkznwwpsbgatlsxfhpcidfgzrc");
	}

}
