class SavingsAccount extends BankAccount {
	
	/**
	 * The % of money you get as interest
	 */
	private double interestRate;
	private double interest;
	private double visualBalance;
	public SavingsAccount() {
		super();
		interestRate = (((Math.random() * 81 + 20) / 1000));
	}

	/* (non-Javadoc)
	 * @see BankAccount#calculateAndUpdateBalance()
	 */

	@Override
	public void calculateAndUpdateBalance() {
		interest = balance * (interestRate/12);
		visualBalance = balance;
		this.balance += interest;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		
		return "The balance for account #"+ accountNo +" is $"+ form(visualBalance)+" the interest is "+ form(interest);


	}

}