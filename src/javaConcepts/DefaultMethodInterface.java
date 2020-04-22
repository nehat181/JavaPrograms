package javaConcepts;


interface demo
{
	void abc();
	
	 default void show(){
		
		System.out.println("show");
	}
}

class demoImp implements demo
{

@Override
public void abc() {
	System.out.println("abc");
	
}
}
public class DefaultMethodInterface {

	public static void main(String[] args) {
		demoImp obj=new demoImp();
		obj.show();
		obj.abc();

	}

}
