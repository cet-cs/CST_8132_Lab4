/**
 * @author Nicholas Gingras
 * @Version 1
 * @since 1
 */

class ChequingAccount extends BankAccount {
	private double  fee;
	public ChequingAccount() {
		super();
		fee = ((Math.random() *((5 - 1) + 1)+ 1));
	}
	
	/**
	 * The amount removed as chequing account fee
	 */


	/* (non-Javadoc)
	 * @see BankAccount#calculateAndUpdateBalance()
	 */
	@Override
	public void calculateAndUpdateBalance() {

		balance -= fee;

	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		fee = Math.round(fee*100)/100;
		return "The balance for account #"+ accountNo +" is $"+ form(balance)+" the fee is "+ fee;

	}

}