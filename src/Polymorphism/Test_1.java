package Polymorphism;

public class Test_1 {
	
	public void person(String Teacher) {
		
		System.out.println("This Person is Teacher");
	}
	
    public void person() {
		
		System.out.println("This is person only ");
	}
    
    public void person(String Actor ,String Customer) {
		
		System.out.println("This is person Actor and Customer ");
	}

    
    public void m1(int a) {
    	System.out.println("M1 Test - int");
    }
    
    public void m1(double b) {
    	System.out.println("M1 Test -double");
    }
    
    public void m2(int a,String b) {
    	System.out.println("Test m2");
    }
    
    public void m2(String a,int b) {
    	System.out.println("Test m2");
    }
    
    
	public static void main(String[] args) {
		
		Test_1 test=new Test_1();
		
		test.person();
		test.person("ABC");
		test.person("RTS", "Hero");
		
		test.m1(12.5);
		test.m1(10);
		
		test.m2(1, "test");
		test.m2("xyz", 5);
		

	}

}
