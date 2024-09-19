package DemoTest;

public class MethodTestConcept {

	int a=10; // Instance varible
	static double d=12.5; // Static Varible 
	
	// non static 
	public void demo() {
		System.out.println("Welcome to the BugSpotter");
	}
	
	// static 
	public static void display() {
		
		System.out.println("Test Engginer");
	}
	public static void main(String[] args) {
		
		//static varible /static method --- // use Classname.variblename
		
		System.out.println(MethodTestConcept.d); // 12.5
		// static method call
		MethodTestConcept.display();
		
		
		//non static -- we need to create Object of class
		MethodTestConcept test=new MethodTestConcept();
		
		System.out.println(test.a);
		test.demo();
		
		
	}

}
