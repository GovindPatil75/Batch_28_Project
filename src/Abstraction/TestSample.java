package Abstraction;

public abstract class TestSample {
	
	// concreate method
	public void m1() {
		System.out.println("Test M1");
	}

	public void m2() {
		System.out.println("Test M2");
	}
	
	//Abstract method
	public abstract void m3() ;
	
	
	public static void main(String[] args) {
		
		// we can not create the object 
		//TestSample test=new TestSample();
		

	}

}
