package Abstraction;

public class HDFC extends BankAccount{

	@Override
	public void savingAccount() {
		
		System.out.println("Saving Account -HDFC");
	}

	@Override
	public void currentAccount() {
		
		System.out.println("Current Account -HDFC");
	}

	@Override
	public void fixedDepositAccount() {
		
		System.out.println("Fixed Deposit Account -HDFC");
	}

}
