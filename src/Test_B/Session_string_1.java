package Test_B;

public class Session_string_1 {

	public static void main(String[] args) {
		
		String s1="Test";  // SCP
		String s2=new String("Demo"); // HM-SCP
		String s3="Test";
		String s4=new String("Test");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//equals() --- content comparision 
		if(s1.equals(s4)) {
			System.out.println("Both strings are equals");
		}else {
			System.out.println("Both strings are not equals");
		}

		// ==  refrence comparision - s1==s3 /s1==s4
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}

}
