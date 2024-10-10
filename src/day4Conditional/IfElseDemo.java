package day4Conditional;

import java.io.File;

public class IfElseDemo {
	
	// Here are some real-world examples where an if else condition is used in Java:
	// There is a single condition to be checked but either of job to be done
	// 1. User Login Authentication - A typical use case in applications where the user is trying to log in, and the system checks if the credentials are correct.
	// 2. Bank ATM Transaction - When a user tries to withdraw money from an ATM, the system checks if the balance is sufficient.
	// 3. Age Verification for Voting - A program that checks if a user is eligible to vote based on their age. 
	// 4. Hotel Room Reservation - A program that checks room availability and books a room accordingly. 
	// 5. Checking if a number is even or odd
	// 6. Largest of the two number
	public static void main(String[] args) {
		
	/*
	String username = "admin";
	String password = "admin1234";
	
	if(username.equals("admin") && password.equals("admin123")) {
		System.out.println("Login Successful");
	} else {
		System.out.println("Invalid credentialds, please truy again.");
	}
	*/
	
	/*
	double accountBalance = 5000.00;
	double withdrawAmount = 600.00;
	
	if(withdrawAmount <= accountBalance) {
		System.out.println("Transaction successful. Please collect your cash");
	} else {
		System.out.println("Insufficient balance");
	}
	*/
		/*
		int age = 26;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        */
		boolean isRoomAvailable = false;
		
		 if (isRoomAvailable) {
	            System.out.println("Room booked successfully.");
	        } else {
	            System.out.println("No rooms available.");
	        }
		
	
	}
}
