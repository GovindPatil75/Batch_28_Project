package Inheritance;

public class Child_B extends Parent_A{
	
	
	String name="Demo";
	
	public void p1() {
		System.out.println("Test P1");
	}

	public static void main(String[] args) {
		
		Child_B c=new Child_B();
		
		System.out.println(c.name);
		c.p1();
		
		System.out.println(c.a);
		c.m1();
		
	
	}

}
