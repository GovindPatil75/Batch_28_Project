package Encapsulation;

public class Test_1 {

	private int Balance;
	private String Name;
	
	public int getBalance() {
		
		return Balance;
	}
	
	public void setBalance(int Balance) {
		
		this.Balance=this.Balance+Balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
