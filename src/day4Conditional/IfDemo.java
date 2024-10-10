package day4Conditional;

import java.io.File;

public class IfDemo {
	// Here are some real-world examples where an if condition is used without an else part in Java:
	// 1. Checking for File Existence - 
	// 2. Sending a Notification if a User is Online - 
	// 3. Logging an Event if Debug Mode is Enabled - 
	// 4. Applying a Discount if a Coupon is Valid - 
	// 5. Email Validation Before Submission - 
	
	public static void main(String[] args) {
		
	
	File file = new File("example.txt");

    // If the file exists, perform an action
    if (file.exists()) {
        System.out.println("The file exists.");
        // You could add file reading or other operations here
    }
    
    boolean isUserOnline = true;

    // If the user is online, send a notification
    if (isUserOnline) {
        System.out.println("Sending notification: Your friend is online.");
    }

    boolean debugMode = true; // This would typically be set in configuration

    // If debug mode is enabled, log the debug information
    if (debugMode) {
        System.out.println("Debug: Entering the main function.");
    }
    
    boolean validCoupon = true; // Simulating a valid coupon

    double price = 100.0;

    // Apply discount if coupon is valid
    if (validCoupon) {
        price = price * 0.9; // Apply a 10% discount
    }

    System.out.println("Final price: $" + price);
    
    String email = "user@example.com"; // Simulate an email field

    // If the email is not empty, proceed with sending the form
    if (!email.isEmpty()) {
        System.out.println("Proceeding with form submission.");
    }
    
    System.out.println("Program execution continues...");
	}
	
	// vedio link - 6:48 https://playlist.tools/PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR/-Xi7bzi6IcU
}
