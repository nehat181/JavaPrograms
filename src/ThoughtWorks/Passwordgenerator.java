package ThoughtWorks;

public class Passwordgenerator {
	
	public static String  generate(String input){
		
		String output="";
		
		for(int i=0;i<input.length();i++){
			char c=input.charAt(i);
			int Ascii=Character.getNumericValue(c)+97;
			
			output+=(char)Ascii;//int to ACII
					
		}
		
		return output;
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=generate("134011");
		System.out.println(s);

	}

}
