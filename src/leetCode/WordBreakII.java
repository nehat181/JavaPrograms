package leetCode;

import java.util.ArrayList;
import java.util.List;

class trieNode{
	
	boolean eow;
	trieNode[] ch=new trieNode[26];
	
	public trieNode(){
		
		for(int i=0;i<26;i++) {
			
			ch[i]=null;
			eow=false;
		}
		
		
	}
	
}

class WordBreakII{
	 public static trieNode root;
	 WordBreakII(){
	 root=new trieNode();
		
	}
	
	trieNode node=root;
	
	void insert(String word) {
		trieNode node=root;
	for(char c:word.toCharArray()) {
		
		int index=c-'a';
		if(node.ch[index]==null) {
			
			node.ch[index]=new trieNode();
			node=node.ch[index];
			
		}
		else {
			
			node=node.ch[index];
		}
				
	}
	node.eow=true;
	
	}
	
	public List<String> wordBreak(String s, List<String> wordDict){
		List<String> out=new ArrayList<String>();
		String output="";
		trieNode node=root;
		 
		 for(int i=0;i<wordDict.size();i++) {
			
			insert(wordDict.get(i));
			 
		 }
		 
		 for(int i=0;i<s.length();i++) {
			 
			 char c=s.charAt(i);
	    		int index=c-'a';
	    		
				if((node.ch[index]!=null)&&(node.eow==false)) {
					output+=Character.toString(c);
					node=node.ch[index];
					
					
				}
				else {
					output+=" ";
					i--;
					node.eow=false;
					
				}
				
		 
	}
		 return wordDict;
	
	
}


		 
		
		 
		 
		 
		
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsandog";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("cats");
		wordDict.add("dog");
		wordDict.add("sand");
		wordDict.add("and");
		wordDict.add("cat");
		
				
				System.out.println(new WordBreakII().wordBreak(s,wordDict));
	}

}
