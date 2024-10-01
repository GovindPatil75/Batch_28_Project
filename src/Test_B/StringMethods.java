package Test_B;

public class StringMethods {

	public static void main(String[] args) {
		
		String name="BugSpotter Classes";
		String email="Test@gmail.com";
		 
		//length()
		int lengthofstring=name.length();
		System.out.println(lengthofstring);
		
		//charAt(int index)
		char c=name.charAt(4);
		System.out.println(c);
		
		for(int i=0;i<lengthofstring;i++) {
			
			char a=name.charAt(i);
			System.out.println (a);
		}
		
		//equals()
		System.out.println(name.equals(email)); //false
		
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s1.equals(s2));
		
		//euqalsignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String filepath="file.csv";
		
		//endsWith()
		if(filepath.endsWith(".pdf")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
		//startWith()
		if(filepath.startsWith("file")) {
			System.out.println("Test pass");
		}

		String no="  test123  ";
		System.out.println(no);
		//trim()
		System.out.println(no.trim());
		
		String mob="123456@56789";
		
		//String []
		String [] a=mob.split("@"); //substring divide
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
	}

}
