package leetCode;

import java.util.HashMap;

public class WordPattern {
	
	
public boolean wordPattern(String pattern, String str) {
        
        
        HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
        StringBuffer patter1=new StringBuffer();
        
        for(int i=0;i<pattern.length();i++){
            
            if(hm1.containsKey(pattern.charAt(i))){
              
            }
            else{
                hm1.put(pattern.charAt(i),i);
            }
        }
        
        for(int i=0;i<pattern.length();i++){
            
            if(hm1.containsKey(pattern.charAt(i))){
            patter1.append(hm1.get(pattern.charAt(i)));
            }
        }
        String [] st=str.split(" ");
                
                 HashMap<String,Integer> hm2=new HashMap<String,Integer>();
        StringBuffer str1=new StringBuffer();
        for(int i=0;i<st.length;i++){
            
            if(hm2.containsKey(st[i])){
              
            }
            else{
                hm2.put(st[i],i);
            }
        }
        
                
        for(int i=0;i<st.length;i++){
            
            if(hm2.containsKey(st[i]))
            str1.append(hm2.get(st[i]));
        }
             if(str1.toString().equals(patter1.toString()))
                return true;
                
                return false;
                
                
                
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPattern obj=new WordPattern();
		System.out.println(obj.wordPattern("abba","dog cat cat dog"));
		
	}

}
