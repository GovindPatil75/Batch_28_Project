package Inheritance;

public class Child_c extends Child_B{

	public void r1() {
		System.out.println("Test r1");
	}
	
	public static void main(String[] args) {
		
		Child_c d=new Child_c();
		
		System.out.println(d.a);
		d.m1();
		
		d.p1();
		System.out.println(d.name);
		
		d.r1();
	}

}
