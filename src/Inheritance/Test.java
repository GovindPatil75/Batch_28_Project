package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		
		A Obj_a=new A();
		System.out.println(Obj_a.a);
		Obj_a.p1();
		
		
		// Single level inheritance 
		B Obj_b=new B(); // B extends A
		System.out.println(Obj_b.email);
		Obj_b.r1();
		System.out.println(Obj_b.a);
		Obj_b.p1();
		
		//Obj_b.t1(); -- parent method define as private 
		
		
		
		
		

	}

}
