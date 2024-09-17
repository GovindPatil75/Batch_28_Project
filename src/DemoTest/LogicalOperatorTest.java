package DemoTest;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		int c=5;
		
		System.out.println(a>b && b>c); // F && F =F
		System.out.println(b>a && b>c); // T && F= F
		System.out.println(a>b && c>b); // F && T =F
		System.out.println(b>a && c>b); // T && T =T
		
		
		System.out.println(a>b || b>c); // F || F =F
		System.out.println(b>a || b>c); // T || F =T
		System.out.println(a>b || c>b); // F || T =T
		System.out.println(b>a || c>b); // T || T =T
		
		System.out.println(!(a>b)); // !(F)=T
		System.out.println(!(b>a)); // !(T)=F
	}

}
