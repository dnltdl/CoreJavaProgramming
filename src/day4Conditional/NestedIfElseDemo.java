package day4Conditional;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
	// 1. ATM Withdrawal with Daily Limit and Balance Check
	     // In an ATM system, nested if-else conditions can be used to check multiple conditions 
		 // like if the requested withdrawal amount is within the daily limit and if the account balance is sufficient.
	
	// 2. Employee Bonus Based on Performance and Years of Service
		// In a company, employees get a bonus based on their performance rating and years of service. 
		// Employees with higher ratings and more years of service get bigger bonuses.
	
	// 3. Ticket Pricing Based on Age and Day of the Week
		// In a cinema, ticket prices vary based on age (child, adult, or senior citizen) and 
		// whether it's a weekday or weekend. 	
		
	// 4.  Credit Card Approval Based on Income and Credit Score
		// A bank uses nested conditions to determine if a customer is eligible for a credit card based 
		// on their income and credit score.
		
		/*
		double dailyLimit = 10000.0;
        double accountBalance = 500.0;
        double requestedAmount = 2000.0;

        if (requestedAmount <= dailyLimit) {  // First check if the requested amount is within the daily limit
            if (requestedAmount <= accountBalance) {  // Check if the account has sufficient balance
                System.out.println("Withdrawal successful! Please collect your cash.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Requested amount exceeds daily limit.");
        }
        */
		/*
        int performanceRating = 4;  // Performance rating out of 5
        int yearsOfService = 3;
        double bonus = 0.0;

        if (performanceRating >= 4) {  // Check if the performance rating is high enough
            if (yearsOfService >= 5) {  // Check years of service for extra bonus
                bonus = 1000.0;
            } else {
                bonus = 500.0;
            }
        } else if (performanceRating >= 3) {
            if (yearsOfService >= 5) {
                bonus = 300.0;
            } else {
                bonus = 100.0;
            }
        } else {
            System.out.println("No bonus due to low performance.");
        }

        if (bonus > 0) {
            System.out.println("You received a bonus of $" + bonus);
        }
        */
		/*
		 	int age = 65;
	        String day = "Saturday";
	        double ticketPrice = 0.0;

	        if (age <= 12) {  // Check if the person is a child
	            ticketPrice = 5.0;
	        } else if (age >= 60) {  // Check if the person is a senior citizen
	            ticketPrice = 6.0;
	        } else {  // Adult pricing
	            ticketPrice = 10.0;
	        }

	        // Nested if to check if it’s a weekend, where prices are higher
	        if (day.equals("Saturday") || day.equals("Sunday")) {
	            ticketPrice += 2.0;
	        }

	        System.out.println("Your ticket price is: $" + ticketPrice);
			*/
		
			/*
		 	double income = 5000;
	        int creditScore = 700;
	        boolean isApproved = false;

	        if (income >= 50000) {  // Check if income is above the minimum requirement
	            if (creditScore >= 700) {  // Check if the credit score is good enough
	                isApproved = true;
	            } else {
	                System.out.println("Credit score too low.");
	            }
	        } else {
	            System.out.println("Income too low.");
	        }

	        if (isApproved) {
	            System.out.println("Credit card application approved!");
	        } else {
	            System.out.println("Credit card application denied.");
	        }
	        */
	} // end main

}
