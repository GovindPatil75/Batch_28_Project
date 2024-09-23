package Test_A;






class Test_same_Pkg{
	
	public int x=1;
	protected int y=2;
	private int z=3;
	int p=4;
	
}

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
		
		Test_same_Pkg test1=new Test_same_Pkg();
		
		System.out.println(test1.x); // public 
		System.out.println(test1.y); // protected
		//System.out.println(test1.z); // private 
        System.out.println(test1.p); // deafult
	}

}
