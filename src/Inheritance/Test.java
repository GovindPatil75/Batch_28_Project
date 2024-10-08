package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		
		A Obj_a=new A();
		System.out.println(Obj_a.a);
		Obj_a.p1();
		
		
		// Single level inheritance 
		B Obj_b=new B(); // B extends A
		//self
		System.out.println(Obj_b.email);
		Obj_b.r1();
		//parent property
		//System.out.println(Obj_b.a);
		//Obj_b.p1();
		
		//Obj_b.t1(); -- in parent class - method define as private 
		
		C obj_c=new C();
		
		// A-->B--->C
		//System.out.println(obj_c.a);
		//obj_c.p1();
		
		System.out.println(obj_c.email);
		obj_c.r1();
		
		obj_c.n1();
		
		
		// Hierachical Inheritance 
		X obj_x=new X(); // Parent X
		
		System.out.println(obj_x.name);
		obj_x.u2();
		
		Y obj_y=new Y(); // Y extends X
		System.out.println(obj_y.name);
		obj_y.u2();
		System.out.println(obj_y.b);
		
		Z obj_z=new Z(); // Z extends X
		System.out.println(obj_z.name);
		obj_z.u2();
		System.out.println(obj_z.s);

	}

}
