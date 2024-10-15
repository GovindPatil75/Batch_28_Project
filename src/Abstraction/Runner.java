package Abstraction;

public class Runner {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.currentAccount();
		sbi.savingAccount();
		sbi.fixedDepositAccount();
		
		
		HDFC hdfc=new HDFC();
		hdfc.savingAccount();
		hdfc.currentAccount();
		hdfc.fixedDepositAccount();
		
		
		
	}

}
