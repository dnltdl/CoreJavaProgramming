package day2VariablesDatatypes;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable declaration - don't know the value
		int a;
		// variable assignment - no need to specify data type again
		a = 10;
		int b = 100; // declaration + assignment
		// print a value of variable
		System.out.println(b); // initial values - 100
		b = 200; // change a values for a variable unless it's final / constant variables
		System.out.println(b); // b is now 200
		
		// Approach 1 - if a variables belongs to d/t data type
		
		int x = 100;
		int y = 200;
		int z = 300;
		System.out.println("x + y + z = " + (x + y + z));
		
		// Approach 2(Multiple variables) - if all the variables are belongs to the same data type
		int x1,x2,x3;
		x1=1; 
		x2=2; 
		x3=3;
		System.out.println("x1 + x2 + x3 = " + (x1 + x2 + x3));
		// Approach 3 - if all the variables are belongs to the same data type
		int y1=1, y2=2, y3=3;
		System.out.println("y1 + y2 + y3 = " + (y1 + y2 + y3));
		// Approach 4- if all the variables are the same data type and values
		int z1,z2,z3;
		z1=z2=z3=100;
		System.out.println("z1 + z2 + z3 = " + (z1 + z2 + z3));
		
		char grade = 'A';
		System.out.println(grade);
		
		// data types - premitive data types
		// 1. byte, short, int, long ---> for numbers without decimal point
		// 2. float, double --> for a numbers containing fractions
		// 3. char - used to represent a single character and unicode symbols
		// 4. boolean - true/false values
		
		
	}

}
