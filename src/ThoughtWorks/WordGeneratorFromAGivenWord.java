package ThoughtWorks;

import javax.swing.plaf.basic.BasicSliderUI.ChangeHandler;

public class WordGeneratorFromAGivenWord {

	
	public static String wordgenerateForward(String s){
		
		String output="";
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++){
		
		int OutASCII=c[i]+3;
		if(OutASCII>'z'){
				int diff=OutASCII-'z';
				OutASCII='a'+diff-1;
				}
		
		
		if(OutASCII>'Z'&&OutASCII<'a'){
			int diff=OutASCII-'Z';
			OutASCII='A'+diff-1;
			
		}
		output+=Character.toString(OutASCII);
		
		}
		return output;
	}
	
	
public static String wordgenerateBackward(String s){
		
	String output="";
	char[] c=s.toCharArray();
	
	for(int i=0;i<c.length;i++){
	int InpASCII=c[i];
	int OutASCII=InpASCII-3;
	if(OutASCII<65){

		int diff=65-OutASCII;
			OutASCII=90-diff+1;
			}
	
	
	if(OutASCII<97&&OutASCII>90){
		int diff=97-OutASCII;
		OutASCII=122-diff+1;
		
	}
	output+=Character.toString((char) OutASCII);
	
	}
	return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String output=wordgenerateForward("Javax");
		//String output=wordgenerateBackward("Txdolwb");//Java-Mdyd,Quality-Txdolwb
		System.out.print(output);
	}

}
