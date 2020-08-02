package leetCode;

public class ValidateIpAddress {
	
	  public static String validIPAddress(String IP) {
		 
		  
		 
		  String IPtype="";
		  if(IP.contains(".")&&IP.split("\\.").length==4) {
			  if(IP.contains("..")) return "Neither";
			  char last=IP.charAt(IP.length()-1);
			  if(last=='.') return "Neither";
			  for(String S:IP.split("\\.")) {
				  int val;
				  if(S.length()>1&&S.charAt(0)=='0') return "Neither";
				  
				  try {
				   val=Integer.parseInt(S);
				  }
				  catch(NumberFormatException e ) {
					  return "Neither";
				  }
				  if(val>255) return "Neither";
				  IPtype="IPv4";
				  
			  }
			  
			  
		  }
		  else if (IP.contains(":")&&IP.split("\\:").length==8){
			  
			  char last=IP.charAt(IP.length()-1);
			  if(last==':'||IP.contains("::")) return "Neither";
			  for(String S:IP.split("\\:")) {
				  if(S.length()>4) return "Neither";
				  
				
				  if(S.length()<3) {
					  if(S.equalsIgnoreCase("0")) {}
					  
				  }
				  
				  for(char c:S.toCharArray()) {
					  
					  try {
						  int ascii=c;
						  if(c<90&&c>70) return"Neither";
						  if(c>97&&c>102) return"Neither";
					  }
					  catch(Exception e) {
						  
					  }
				  }
				  IPtype="IPv6";
				  
			  }
			  
			  
		  }
		  else {
			  return "Neither";
		  }
		  
		  
		return IPtype;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="192.0.0.1"
;
		int asc='A';
		
		
		String valid=validIPAddress(s);
		System.out.println(valid);

	}

}
