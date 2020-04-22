package javaConcepts;


interface test
{
	int num=8;
	void abc();
	
	 static void show(){
		
		System.out.println("show");
	}
}

public class StaticMethodInterface {
	
	public static void main(String[] args){
	
	test.show();
		
	
	}
}
