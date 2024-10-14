package Encapsulation;

public class Gpay {

	public static void main(String[] args) {
		
		Test_1 test=new Test_1();
		
		test.setName("ABC");
		String Name =test.getName();
		System.out.println(Name);
		
		
		test.setBalance(10);
		int currentBalance=test.getBalance();
		
		System.out.println(currentBalance);
		
		test.setBalance(20);
		int cb=test.getBalance();
		
		System.out.println(cb);
	}

}
