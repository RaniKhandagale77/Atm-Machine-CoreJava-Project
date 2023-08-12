package com.jsp.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("###,#0.00");
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	
	/* Set Customer Number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	/* Get Customer Number */
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Set Pin Number */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	/* Get pin Number */
	
	public int getPinNumber() {
		return pinNumber;
	}
	  
	 /* Get Checking Account Balance */
	 
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
    /* Get Saving Account Balance */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate Checking Account WithDrawal */
	
	public double calcCkeckingwithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/* Calculate Saving Account withdrawal */
	
	public double calcSavingwithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	
         /* Calculate Checking Account deposit */
	
	     public double calcCheckingDeposit(double amount) {
		   checkingBalance = (checkingBalance + amount);
		    return checkingBalance;
	}
     /* Calculate Saving Account deposit */
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	
	/*Customer Checking Account Withdraw Input */
	
	public void getCheckingwithdrawInput() {
		System.out.println("Checking Account Balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account");
		double amount =input.nextDouble();
		
		if((checkingBalance - amount)>=0) {
			calcCkeckingwithdraw(amount);
			System.out.println("New Checking Account Balance "+moneyFormat.format(checkingBalance));
		}
		else {
			System.out.println("Balance Cannot be  negative"+"\n");
		}
	}
	
	/*Customer Saving Account Withdraw Input */
	 
	 public void getSavingwithdrawInput() {
			System.out.println("Saving Account Balance"+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to withdraw from saving account");
			double amount =input.nextDouble();
			
			if((savingBalance - amount)>=0) {
				calcSavingwithdraw(amount);
				System.out.println("New saving Account Balance "+savingBalance+"\n");
			}
			else {
				System.out.println("Balance Cannot be  negative"+"\n");
			}
	 }
	 
            /*Customer Checking Account Deposit Input */
	 
	 public void getCheckingDepositInput() {
			System.out.println("Checking Account Balance"+moneyFormat.format(checkingBalance));
			System.out.println("Amount you want to deposit from checking account");
			double amount =input.nextDouble();
			
			if((checkingBalance + amount)>=0) {
				calcCheckingDeposit(amount);
				System.out.println("New checking Account Balance "+moneyFormat.format(checkingBalance));
			}
			else {
				System.out.println("Balance Cannot be  negative"+"\n");
			}
	 }
	 
	/*Customer Saving Account deposit Input */
	 
	 public void getSavingDepositInput() {
			System.out.println("Saving Account Balance"+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to deposit from saving account");
			double amount =input.nextDouble();
			
			if((savingBalance + amount)>=0) {
				calcSavingDeposit(amount);
				System.out.println("New saving Account Balance "+ moneyFormat.format(savingBalance));
			}
			else {
				System.out.println("Balance Cannot be  negative"+"\n");
			}
	 }
	

}
