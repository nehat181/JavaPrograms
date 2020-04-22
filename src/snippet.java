class A{
	public void m(){
		
		
	}
	
}
class B extends A{
	
public void m(){
		
		
	}
}



public class snippet {
	
	
	public void m(Object i)
		{
		
		System.out.println("Object");
		}
	
	public void m(String s)
	{
	
	System.out.println("String");
	}
	
	public static int i;
	//public  static Object myObj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		snippet obj=new snippet();
		obj.m(null);
		
		
		
	}

}
