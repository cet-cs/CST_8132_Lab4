
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**

 * File name: BankAccountTest.java

 * Author: Nicholas Gingras

 * Course: CST_8132 - OOP

 * Assignment: Lab 4

 * Date of creation: Feb 13, 2019

 * Professor: Md. Istiaque Shahriar

 * Purpose: To affect bank accounts by either subtracting fees or adding interest

 * Class List: BankAccount, SavingsAccount, ChequingAccount

 */





/**

 * @author Nicholas Gingras

 * @version 1

 * @since 1

 */

public abstract class BankAccount {

	/**

	 * amount of money in the account

	 */

	double balance;

	/**

	 * Unique Id for an account

	 */

	long accountNo;
	
	/**
	 * the amount of accounts
	 */
	static int numAccounts = 1;
	public BankAccount() {
		accountNo = numAccounts++;
	}
	/**

	 * Represent bank account as a string

	 * @param accNum is the account number

	 * @param balance is the account balance

	 * @return String representation of a bank account

	 */

	public String toString() {

		return "The balance for account #"+ accountNo +" is $"+ this.balance;

	}
	
	/**
	 * @param variable is the double you're trying to format
	 * @return formatted double with only two decimals
	 */
	public String form(double variable) { // rounds to two decimals, also adds comma each 3 digits
		NumberFormat df = DecimalFormat.getInstance();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);
		return(df.format(variable));
	}

	/**
	 * get balance
	 * @return The account balance
	 */

	public double getBalance() {

		return this.balance;

	}

	/**
	 * This affects the balance of an account via fee or interest
	 */

	abstract void calculateAndUpdateBalance();



}








