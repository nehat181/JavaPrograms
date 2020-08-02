package dataStructure;

import java.util.Stack;

class TrieNode{
	
	TrieNode[] children =new TrieNode[26];
	static boolean endofword;
	public TrieNode() {
		
		
		for(int i=0;i<26;i++) {
			 endofword=false;
			children[i]=null;
		}
	}
}
public class Trie {
	 private static TrieNode root;
	public Trie() {
		 root=new TrieNode();
	}

  


    /** Inserts a word into the trie. */
    void insert(String word) {
    
    	TrieNode node=root;
    	for(char c:word.toCharArray()) {
    		
    		int index=c-'a';
    		if(node.children[index]==null) {
    			
    			node.children[index]=new TrieNode();
    			node=node.children[index];
    		}
    		else {
    			node=node.children[index];
    		}
    		
    		node.endofword=true;
    		
    		
    	}
        
    }
    
    /** Returns if the word is in the trie. */
    public static boolean search(String word) {
    	boolean isAvailable=false;
    	TrieNode node=root;
    	
    	for(char c:word.toCharArray()) {
    		
    		int index=c-'a';
    		if((node.children[index]==null)) {
    			return false;
    			
    			
    		}
    		else {
    			node=node.children[index];
    			isAvailable=true;
    		}
    	}
		return isAvailable;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	boolean isPrefix=true;
    	TrieNode node=root;
    	
    	for(char c:prefix.toCharArray()) {
    		
    		int index=c-'a';
    		if((node.children[index]==null)) 
    			return false;
    			node=node.children[index];
    	}
		return isPrefix;
        
    
    	}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keys[] = {"tte", "a", "there", "answer", "any", 
                "by", "bye", "their"}; 
		
		Trie obj=new Trie();
		for(int i=0;i<keys.length;i++) {
		obj.insert(keys[i]);
		}
		boolean an=obj.search("th");
		System.out.println(an);
	}
	

}



