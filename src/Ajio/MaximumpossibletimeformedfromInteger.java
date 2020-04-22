package Ajio;

public class MaximumpossibletimeformedfromInteger {
	
	
	public static void findTime(int [] input){
				String hour="";
				String Prehour="";//{1,2,3,4,2}
		for(int i=0;i<input.length-2;i++){
			for(int j=i+1;j<input.length;j++){
			  String A=String.valueOf(input[i]);
			  String B=String.valueOf(input[j]);
			 
			  if((A+B).compareTo(B+A)>=1){
				  if(Integer.parseInt(A)<3){
					  hour=A+B;
					  if(Prehour.compareTo(hour)<1){
						 Prehour=hour;  
					  }
				    	  }
			  }
		}
		}
		System.out.println(hour);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] input={1,2,3,4,2};//1234--23:41
       findTime(input);
     
	}

}
