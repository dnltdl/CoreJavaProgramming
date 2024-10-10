package day4Conditional;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// Realtime applications -  there is multiple conditions to be checked and multiple jobs to be done
		// 1. Online Shopping Cart Discount - In an e-commerce website, different discounts may be applied based on the total purchase amount.
		// 2. Temperature Control System - In a temperature control system, depending on the temperature, the system turns on heating or cooling.
		// 3. Traffic Light System - A traffic control system that decides the action based on the color of the traffic light.
		// 4. Grading System - A school grading system where the program assigns a letter grade based on the score.
		// 5. Largest of three numbers
		/*
		double totalPurchase = 40.00;
		
		if(totalPurchase >= 100) {
			System.out.println("You get a 10% discount!");
		} else if(totalPurchase >= 50) {
			System.out.println("You get a 5% discount!");
		} else {
			System.out.println("No discount available.");
		}
		*/
		
		/*
		 double currentTemperature = 35.0;

	        if (currentTemperature < 18.0) {
	            System.out.println("Turning on heater...");
	        } else if (currentTemperature > 30.0) {
	            System.out.println("Turning on air conditioner...");
	        } else {
	            System.out.println("Temperature is within the comfortable range.");
	        }
		*/
		/*
		String lightColor = "Blue";

        if (lightColor.equals("Green")) {
            System.out.println("Go.");
        } else if (lightColor.equals("Yellow")) {
            System.out.println("Slow down.");
        } else if (lightColor.equals("Red")) {
            System.out.println("Stop.");
        } else {
            System.out.println("Invalid traffic light signal.");
        }
        */
		/*
		int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        */
		int a=30, b=30, c=30;
		int max=0;
		if((a>b) && (a>c)) {
			max = a;
		} else if ((b>a) && (b>c)) {
			max = b;
		} else {
			max = c;
		}
		
		System.out.println("Max of three number is " + max);
		
	}

}
