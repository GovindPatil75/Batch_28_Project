package DemoTest;

public class VariblesConcept {
	
	static int b=5; // static varible /class varible 
	
	       int c=12; // Instance Varible / non static varible 

	public static void main(String[] args) {
		
        int a=10; // local varible
        
        System.out.println(a); 
        System.out.println(VariblesConcept.b); // classname.variblename
       // System.out.println(b);
        
        //Create Object 
        //ClassName objectname=new ClassName();
        VariblesConcept obj=new VariblesConcept();
        
        System.out.println(obj.c);
	}

}
