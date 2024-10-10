package day4.switchcases;

import java.util.Scanner;

public class ATMTransaction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		int option = scanner.nextInt();
		double balance = 1000.0;
		
		switch(option) {
		case 1: 
			System.out.println("Your balance is : $" + balance);
			break;
		case 2:
			System.out.println("Enter amount to withdraw: ");
			double amount = scanner.nextDouble();	
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Please collect your cash. New balance: $" + balance);
			} else {
				System.out.println("Insufficient balance");
			}
			break;
		case 3: 
			System.out.println("Enter amount to deposit");
			double deposit = scanner.nextDouble();
			
			if(deposit > 0) {
				balance += deposit;
				System.out.println("Money deposited. New balance: $" + balance);
			} else {
				System.out.println("Deposit must be greater than 0 dollars");
			}
			break;
		case 4: 
			System.out.println("Exiting. Thank you !");
			break;
		default:
			System.out.println("Invalid option. Please try again.");
		} // end switch
		scanner.close();
	} // end main

}
