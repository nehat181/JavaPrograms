package important;

public class FindString1RotationofString2 {
	
	
	public static boolean findRotation(String str1,String str2){
		boolean flag=false;
		String output="";
		int i=1;
		int n=str1.length();
		while(i<n){
			for(int j=n-i;j<n;j++){
				
				output+=Character.toString(str1.charAt(j));
			}
			for(int k=0;k<n-i;k++){
				output+=Character.toString(str1.charAt(k));
			}
			
			if(output.equalsIgnoreCase(str2)){
				flag=true;
				break;
			}
			else{
				output="";
			}
			i++;
			
		}
		
		
		System.out.println(flag);
		return flag;
		
	}
	
	public static boolean findRotationefficient(String Str1,String Str2){
		boolean flag=false;
		
		if((Str1+Str1).contains(Str2)){
			flag=true;
		}
		System.out.println(Str1+Str1);
		System.out.println(flag);
		return flag;
		
		
	}
	
	

	public static void main(String[] args) {
		
		String Str1="ABCD";
		String Str2="DABC";
		findRotation(Str1,Str2);
		findRotationefficient(Str1,Str2);
		
		// TODO Auto-generated method stub

	}

}
