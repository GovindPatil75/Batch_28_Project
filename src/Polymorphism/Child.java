package Polymorphism;

public class Child extends Parent {

	
    public void display() {
		
		System.out.println("Dispaly -Child");
	}
    
    public void show(int a,String b) {
		System.out.println("Show-child ");
	}

    public void t1(int a) {
		System.out.println("child -t1");
		
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.show(10, "xyz");
		c.t1(1);
		
		Parent p=new Parent();
		p.display();
		p.show(1, "pqr");
		p.t1(12);

	}

}
