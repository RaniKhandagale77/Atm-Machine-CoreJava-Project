package com.jsp.atm;

import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("###,#0.00");
	
	HashMap<Integer, Integer>data = new HashMap<Integer,Integer>();
	int selection;
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(9875488,9565);
				data.put(898998, 1869);
				data.put(898998, 1869);
				System.out.println("Welcome to the ATM Project!");
				
				System.out.println("Enter Your CustomerNumber!");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin:");
				setPinNumber(menuInput.nextInt());
				
				
			}catch(Exception e) {
				System.out.println("\n"+"Invalid Character(s).Only number."+"\n");
				x=2;
			}
			for(java.util.Map.Entry<Integer, Integer> entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
					getAccountType();
				
			}
		
		System.out.println("\n"+"Wrong Customer Number  or Pin Number."+"\n");
	}
		while(x==1);
	}
		
		/* Display Account Type Menu with Selection */
		
		public void getAccountType() {
			System.out.println("Select the Account you want to accss:");
			System.out.println("Type 1 - Checking Account");
			System.out.println("Type 2 - Saving Account");
			System.out.println("Type 3 - Exit");
			System.out.println("Choice");
			
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				getChecking();
				break;
				
			case 2:
				getSaving();
				break;
				
			case 3:
				System.out.println("Thank you for using this ATM bye.");
				break;
				
			default:
				System.out.println("\n"+"Invalid Choice"+"\n");
				getAccountType();
				
			
			
		}
	}

		
		/* Display Checking Account Menu with Selection */
		
		public void getChecking() {
			System.out.println("Checking Account:");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdrow funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice");
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Checking Account Balance"+moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
				
			case 2:
				getCheckingwithdrawInput();
				getAccountType();
				break;
			
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for using this ATM.Bye");
				break;
				
		 default:
			 System.out.println("\n"+"Invalid choice"+"\n");
			 getChecking();
				
			}
}

		
		/* Display Saving Account Menu With Selection */
		
		public void getSaving() {
			System.out.println("Saving Account");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice:");
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Saving Account Balance:"+ moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
				
			case 2:
				getSavingwithdrawInput();
				getAccountType();
				break;
				
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank you for using this ATM ,Bye");
				break;
				
			default:
				System.out.println("\n"+"Invalid Choice"+"\n");
				getSaving();
			}
		}
		
		}