package leetCode;

class Trienode{
    Trienode[] children=new Trienode[26];
    public boolean isWord;
    public Trienode(){ 
    	   isWord = false;
      for(int i=0;i<26;i++){
           children[i]=null;
       }  
    }
}
public class AddandSearchWord {
	Trienode root;
    public AddandSearchWord() {
        
       root=new Trienode(); 
  }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        
        Trienode curr=root;
        
        for(char c:word.toCharArray()){
            int index=c-'a';
            
            if(curr.children[index]==null){
                
                curr.children[index]=new Trienode();
                curr= curr.children[index];
            }
            else{
                 curr= curr.children[index];
            }
        
        }
        curr.isWord = true;
        
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        
    	 return searchArray(word.toCharArray(), 0, root);  
//        Trienode curr=root;
//        
//          for(char c:word.toCharArray()){
//            int index=c-'a';
//              if(curr.children[index]!=null){
//                
//                
//                curr= curr.children[index];
//            }
//              
//              else{
//                  return false;
//              }
  
}
    
    public boolean searchArray(char[] chars, int start, Trienode node){
    	Trienode cur = node;
        for (int i = start; i < chars.length; i++){
            if (cur == null){
                break;
            }else{
                if (chars[i] != '.'){
                    int index = chars[i] - 'a';
                    cur = cur.children[index];
                }else{
                	Trienode temp = cur;
                    for (int j = 0; j < 26; j++){
                        cur = temp.children[j];
                        if (searchArray(chars, i+1, cur))
                            return true;
                    }
                    return false;
                }
            }
        }
        return cur != null && cur.isWord;
    }
    
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 AddandSearchWord obj = new AddandSearchWord();
//		 obj.addWord("bad");
//		 obj.addWord("bad");
//		 obj.addWord("dad");
//		 obj.addWord("mad");
//		 boolean param_2 = obj.search("ba.");
//		 System.out.println(param_2);
		
		String s="pwwkew";
		  int start=0;
		  int end=0;
		int [] ar=new int[26];
	        int count=0;
	        int max=0;
	        int index;
	        for(char c:s.toCharArray()){
	               index=c-'a';
	            if(ar[index]!=1){
	            	ar[index]=1;
	                count++;
	                
	            }
	            else {
	            	break;
	            }
	            start=count;
	            end=count;
	            
	        }
	            
	            while(start<s.length()) {
	            	
	            
	            	if(max<count)
	            		max=count;
	            	count=0;
	                       	
	            	
	            	 for(int i=start;i<s.length();i++){
	   	              index=s.charAt(i)-'a';
	   	            if(ar[index]!=1){
	   	            	ar[index]=1;
	   	                count++;
	   	                end++;
	   	                
	   	            }
	   	            else {
	   	            	
	   	            	break;
	   	            }
	   	         start++;
	            }
	            

}
	        System.out.println(max);

	}

	
}
