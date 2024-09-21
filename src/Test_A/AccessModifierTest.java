package Test_A;

public class AccessModifierTest {

	 public int a=10;
	 protected int b=20;
	 private int c=30;
	         int d=40;
	         
	public static void main(String[] args) {
		
		AccessModifierTest test=new AccessModifierTest();
		
		System.out.println(test.a); //public 
		System.out.println(test.b); // protected
		System.out.println(test.c); // Private
		System.out.println(test.d); // deafult 

	}

}
