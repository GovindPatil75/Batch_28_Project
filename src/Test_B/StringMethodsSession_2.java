package Test_B;

public class StringMethodsSession_2 {

	public static void main(String[] args) {
		
		String test="BugSpotter";
		String data="";
		String name="Classes";
		
		double d=12345.67;
		
		// isEmpty()
		System.out.println(test.isEmpty()); //false
		System.out.println(data.isEmpty()); //true
		
		//toUpperCase()
		System.out.println(test.toUpperCase());  // BUGSPOTTER
		//toLowerCase()
		System.out.println(test.toLowerCase()); //bugspotter
		
		//concat()
		System.out.println(test.concat(name)); 
		
		//contains()
		System.out.println(test.contains("RTS"));
		
		//replace()
		System.out.println(test.replace("r", "a"));
		
		//valueOf()
		String data1=String.valueOf(d);
		System.out.println(data1);
		
		
		
	}

}
