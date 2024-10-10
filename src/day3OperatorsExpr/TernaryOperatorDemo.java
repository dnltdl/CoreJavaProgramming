package day3OperatorsExpr;
// Unary operators only one variable value is required - ++,--,+=,-=, /=, *=, %=, =, !
// Binary operators two variable value is required - +,-,/,*, >, >=, <, <=, !=, ==, &&, ||
// Ternary operators - ?:


public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// notation - var_type var_name = (condition_check)? value_if_true : value_if_false;
		// example 1
		int a = 200, b = 300;
		int max = (a > b)? a: b;
		System.out.println("Max number is: " + max);
		
		// example 2
		int number = 12;
		String numberChecker = (number % 2 == 0)? "your number is even": "your number is odd";
		System.out.println(numberChecker);
		
		// 

	}

}
