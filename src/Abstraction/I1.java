package Abstraction;

public interface I1 {
	
	public abstract void m1(); // by deafult public abstract 

	                void m2();
	                
	                public default   void m3() {
	                	System.out.println("Test");    	
	                }

	                public static void m4() {
	                	System.out.println(" Test m4");    	
	                }
}
