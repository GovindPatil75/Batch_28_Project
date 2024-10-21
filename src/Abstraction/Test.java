package Abstraction;

public class Test implements I1,I2{

	public static void main(String[] args) {
		
		Test test=new Test();
		test.m1();
		test.m2();
		
	}

	@Override
	public void m1() {
		
		System.out.println("Test m1");
		
	}

	@Override
	public void m2() {
		
		System.out.println("Test m2");
		
	}

	@Override
	public void p1() {
		System.out.println("Test p1");
		
	}

}
