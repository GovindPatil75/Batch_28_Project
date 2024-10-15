package Abstraction;

public class SBI extends BankAccount{

	@Override
	public void savingAccount() {
		System.out.println("Saving Account -SBI");
		
	}

	@Override
	public void currentAccount() {
	
		System.out.println("Current Account -SBI");
	}

	@Override
	public void fixedDepositAccount() {
		
		System.out.println("Fixed Deposit Account -SBI");
	}

}
