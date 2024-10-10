package day3OperatorsExpr;

public class AssignmentDemo {

	public static void main(String[] args) {
		// Assignment : = , shorthand operators (+=, -=, *=, /=, %=)
		// suppose you want to increase or decrease a var value by a number otherthan 1. i.e 5
		// a = a + 5; instead of writing a variable two time or from bothsides of expr
		int a = 10;
		//a += 5; // a = a + 5 -> 15
		//a -= 5; // a = a - 5 -> 5
		// a *= 5; // a = a * 5 -> 50
		//a /= 5; // a = a / 5 -> 2
		a %= 5; // a = a % 5 -> 0
		System.out.println(a);
		
	}

}
