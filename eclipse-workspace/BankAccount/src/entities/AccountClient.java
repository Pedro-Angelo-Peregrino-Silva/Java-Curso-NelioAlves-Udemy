package entities;

public class AccountClient {
	
	private int accountNumber;
	private String accountHolder;
	
	private char initialDeposit;
	
	private double balanceAccount;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
		
	public char getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(char initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public String toString() {
		return String.format("Account %d, ", accountNumber) 
				+ String.format("Holder: %s", accountHolder)
				+ String.format("Balance: %.2f", balanceAccount);
	}
	
	
	

}
