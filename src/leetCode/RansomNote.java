package leetCode;

import java.util.HashMap;

public class RansomNote {
	
	public static boolean canConstruct1(String ransomNote, String magazine){
		
		
		for(int i=0;i<ransomNote.length();i++) {
		
		boolean flag=magazine.contains(Character.toString(ransomNote.charAt(i)));
		if(flag==false) {
		return flag;
			
		}
		
		if(flag==true) {
			magazine=magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");

			
		}
			
		}
		return true;
	
		
	}
	
public static boolean canConstruct(String ransomNote, String magazine){
		
		int count=0;
		char[] ransomNoteArray=ransomNote.toCharArray();
		char[] magazineArray=magazine.toCharArray();
		
		for(int i=0;i<ransomNoteArray.length;i++) {
			
			for(int j=0;j<magazineArray.length;j++) {
				
				if(ransomNoteArray[i]==magazineArray[j]) {
					magazineArray[j]=' ';
					count++;
					break;
					
				}
			}
			
			
		}
		System.out.println(count);
		
		return count==ransomNoteArray.length?true:false;
	
		
	}


public static boolean canConstruct2(String ransomNote, String magazine){
	HashMap<Character,Integer> maz=new HashMap<>();
	
	boolean flag=true;
	for(char val:magazine.toCharArray()) {
		
		if(maz.containsKey(val)) {
			
			maz.put(val, maz.get(val)+1);
		}
		
		else {
			maz.put(val, 1);
		}
	}
	
	for(char val:ransomNote.toCharArray()) {
		
		if(maz.containsKey(val)) {
			
			{
				if(maz.get(val)>=1) {
					maz.put(val, maz.get(val)-1);
				
				}
				else {
					return false;
				}
				
				
				
			}
		}
		else {
			return false;
		}
	}
	
	
	return flag;

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct2("aa", "ab"));;
		
	}

}
