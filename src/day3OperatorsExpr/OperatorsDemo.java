package day3OperatorsExpr;

public class OperatorsDemo {

	public static void main(String[] args) {
		//1 Arithmetic numbers -> + , -, /, * , %
		int a=10, b=20;
		int sum = a+b;
		System.out.println("sum of a and b : " + sum);
		System.out.println("sum of a and b : " + (a + b));
		System.out.println("Diff of a and b : " + (a - b));
		System.out.println("Div of a and b : " + (a / b));
		System.out.println("Mul of a and b : " + (a * b));
		System.out.println("Remainder of a and b : " + (a % b));
		
		//2 Relational / Comparison operators > , >=, <, =<, !=, ==
		// Always returns a boolean value - true/false
		boolean result = a> b;
		System.out.println("result of a>b " + result);
		System.out.println("a>b " + (a>b));
		System.out.println("a>=b " + (a>=b));
		System.out.println("a<b " + (a<b));
		System.out.println("a<=b " + (a<=b));
		System.out.println("a!=b " + (a!=b));
		System.out.println("a==b " + (a==b));
		
		//3 Logical Operators : &&, ||, !
		// returns boolean value - true/false
		// works between 2 boolean values
		boolean x  = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println("b1 " + b1);
		System.out.println((10 > 20) && (!b1));
		
	}

}
