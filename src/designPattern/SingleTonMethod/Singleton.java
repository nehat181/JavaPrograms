package designPattern.SingleTonMethod;

public class Singleton {
	
	
	private static Singleton obj;
	
	private Singleton(){
		
	}
	
	
	private static synchronized Singleton createObject(){
	if(obj==null){
		
		obj=new Singleton();
		
		
	}
	
	
	return obj;
	}

}
