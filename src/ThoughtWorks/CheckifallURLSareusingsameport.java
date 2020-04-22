package ThoughtWorks;

import java.util.ArrayList;
import java.util.List;

/*Given a list of urls in standard fomrat(protocol://hostname:port/path?query#hash). Check if all the
urls are using same port.
Input: A list of maxium 100 urls in below format.
[url1,url2,url3...url100]
Note: If port is not specified in the url then the standard port as per the protocol should be taken int
consideration. Example, Port for https://google.com & https://facebook.com should be considered 443
as protocol is https. Hence, output is YES.
Output: Print YES if all the urls are using same port otherwise NO.
Example:
Input: [https://foo.com:8080,http://bar.co.in:8080,ftp://domain.xyz.abc:8080]
Output: YES
Example:
Input: [http://example.com:8181,https://foo.xyz:9090,http://www.domain.test/admin?user=admin]
Output: NO
*/

public class CheckifallURLSareusingsameport {
	
	
	public static boolean checkURL(String s){
		boolean flag=false;
		String port1="0";
		String port2="";
		String[] urls=s.split(",");
		for(int i=0;i<urls.length;i++){
			
			
			String [] singleurl=urls[i].split(":");
			if(singleurl.length==2){
				if(singleurl[0].equalsIgnoreCase("https")){
					port2="443";
				}
				if(singleurl[0].equalsIgnoreCase("http")){
					port2="442";
				}
				
                  if(!(port2.equalsIgnoreCase(port1))){
				    flag=false;
				
               }
                  else{
                	  flag=true;
                  }
                  port1=port2;
			}
			
			else{
			 port2=singleurl[2];
			if(port2.contains("/")){
				port2=port2.split("/")[0];
			}
			
			System.out.println("port2 "+port2);
			System.out.println("port1 "+port1);
			if(port2.equalsIgnoreCase(port1)){
				
				if(i==urls.length-1){
					flag=true;
				}
			}
			port1=port2;
					
			
		
		}
		}
		
		System.out.println(flag);
		return flag;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="http://foo.com,https://bar.com,https://domain.com";
		checkURL(s);
		

	}

}
