package Abstraction;

public class TestSampleChild extends TestSample{

	public static void main(String[] args) {
		
		TestSampleChild test=new TestSampleChild();
		test.m1();
		test.m2();
		test.m3();
		

	}

	@Override
	public void m3() {
		System.out.println("Test m3");
		
	}

}
