package ThoughtWorks;

import java.util.HashSet;

public class CountPairWithOneDifferentCharacter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array[] = {"def", "deg", "dmf", "xef", "dxg"} ;
		String temp="";
		HashSet<String> hs=new HashSet<>();
		int n=array[0].length();
		String prev=array[0];
		for(int i=0;i<n;i++) {
			temp=array[0];
			
			
			hs.add(temp.replace(temp.charAt(i), '#'));
			
		}
		int count=0;
		
		for(int i=1;i<array.length;i++) {
			temp=array[i];
			for(int j=0;j<n;j++) {
				
				temp.replace(temp.charAt(j), '#');
				
				if(hs.contains(temp.replace(temp.charAt(j), '#'))) {
					System.out.println(prev+","+array[i]);
					count++;
				}
				hs.add(temp.replace(temp.charAt(j), '#'));
			}
				
				prev=array[i];
				
				
			
			
			
		}
		System.out.println(count);
		
		
		


	}

}
