package javaConcepts;

class A{


	public void show(){

		System.out.println("Class A");

	}
}


public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(){
                   public void show()
                         {
	                System.out.println("Anonymous Class");
                          }
		             };
		obj.show();

	}

}
