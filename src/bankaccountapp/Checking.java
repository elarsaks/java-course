package bankaccountapp;

public class Checking extends Account {
	// List properties for checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Checking Account Features: " + 
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPIN
				);
	}
}
