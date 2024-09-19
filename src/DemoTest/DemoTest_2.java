package DemoTest;

public class DemoTest_2 {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void substraction(int a,int b) {
		
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		DemoTest_2 test=new DemoTest_2();
		test.add(1, 2);
		test.add(5, 8);
		test.substraction(10, 5);

	}

}
