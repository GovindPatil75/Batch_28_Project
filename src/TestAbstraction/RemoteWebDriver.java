package TestAbstraction;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void b1() {
		
		System.out.println("Test b1");
		
	}

	@Override
	public void b2() {
		System.out.println("Test b2");
		
	}

	@Override
	public void b3() {
		System.out.println("Test b3");
		
	}

	@Override
	public void a1() {
		System.out.println("Test a1");
		
	}

	@Override
	public void a2() {
		System.out.println("Test a1");
	}

}
