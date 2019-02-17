/**

 * File name: BankAccountTest.java

 * Author: Nicholas Gingras

 * Course: CST_8132 - OOP

 * Assignment: Lab 4

 * Date of creation: Feb 13, 2019

 * Professor: Md. Istiaque Shahriar

 * Purpose: instance bank accounts and run methods to calculate changes in them as well as display changes


 */

/**
 * @author Nicholas Gingras
 * @version 1
 * @see
 * @since 1
 */
public class BankAccountTest {

	/**
	 * array of bank accounts
	 */
	BankAccount[] bankArray = new BankAccount[5];
	/**
	 * instances bankAccounts, assigns values to them and populates bankArray with them
	 */
	public BankAccountTest() {
		SavingsAccount savings1 = new SavingsAccount();
		SavingsAccount savings2 = new SavingsAccount();
		ChequingAccount chequing1 = new ChequingAccount();
		ChequingAccount chequing2 = new ChequingAccount();
		ChequingAccount chequing3 = new ChequingAccount();
		savings1.balance = Math.random() * 81 + 20;
		savings2.balance = Math.random() * 81 + 20;
		chequing1.balance = Math.random() * 81 + 20;
		chequing2.balance = Math.random() * 81 + 20;
		chequing3.balance = Math.random() * 81 + 20;
		bankArray[0] = savings1;
		bankArray[1] = savings2;
		bankArray[2] = chequing1;
		bankArray[3] = chequing2;
		bankArray[4] = chequing3;
	}
	
	/**
	 * Runs the calculateAndUpdateBalance methods
	 * @see BankAccount#calculateAndUpdateBalance()
	 * @param bankArr is an array of bank accounts
	 */
	public void monthlyProcess(BankAccount[] bankArr) {
		for (BankAccount x : bankArr) {
				x.calculateAndUpdateBalance();
		}
	}
	
	/**
	 * prints out balance and fees or interest
	 * @param bankAccounts array of bank accounts
	 */
	public void display(BankAccount[] bankAccounts) {
		for (BankAccount bankAccount : bankAccounts) {
			System.out.println(bankAccount);
		}
	}
	
	public static void main(String[] args) {
		BankAccountTest bankTest = new BankAccountTest();
		for (int i = 1; i <= 12; i++) {
			bankTest.monthlyProcess(bankTest.bankArray);
			bankTest.display(bankTest.bankArray);
			System.out.println();
		}

	}

}
