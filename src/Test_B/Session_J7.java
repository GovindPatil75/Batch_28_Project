package Test_B;

public class Session_J7 {

	  // code
	
	public static void main(String[] args) {
		
      int a=5 ;
      int b=3;
      
      System.out.println(a>b); //true
      System.out.println(a<b); //false
      
      //Simple if conditional statement
      if(a<b) {
    	  System.out.println("Test execution");
      }
    		  
	  // if- else
      
      if(a<b) {
    	  System.out.println("Test ");
      }else {
    	  System.out.println("Demo");
      }
      
      // if -- else if -else
      
      if(a<b) {
    	  System.out.println("Test 1");
      }
      else if(a>b) {
    	  System.out.println("Test 2");
      }
      else {
    	  System.out.println("Test 3"); 
      }
      
      // nested if
      
      if(a>b) {
    	  System.out.println("Test Demo");
    	  
    	  if(a==b) {
    		  System.out.println("Demo Test");
    	  }
    	  else {
    		  System.out.println("False case ");
    	  }
    	
      }
      else {
    	  System.out.println("Parent case false");
      }
      
	}

}
