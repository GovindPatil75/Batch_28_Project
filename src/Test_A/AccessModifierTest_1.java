package Test_A;

import Test_B.Test_AccessModifier_B;

public class AccessModifierTest_1 extends Test_AccessModifier_B{

	public static void main(String[] args) {
		
		Test_AccessModifier_B test3=new Test_AccessModifier_B();
		
		AccessModifierTest_1 test4=new AccessModifierTest_1();
		
		//System.out.println(test3.r); // public 
		//System.out.println(test3.t); // protected
		//System.out.println(test3.u); //private
		//System.out.println(test3.i); //deafult
		
		//System.out.println(test4.r); // public 
		//System.out.println(test4.t); //protected
		//System.out.println(test4.u); // private
 		//System.out.println(test4.i); //deafult
		
		
		
		
		
	}

}
