package day3OperatorsExpr;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		// 4A Increment & Decrement ++ / --
		/* ++ is called increment operator, a means of adding 1 to a var value
		// case 1
		int a = 10;
		System.out.println("Before Increment " + a);
		a++;
		System.out.println("After Increment " + a);
		
		*/
		/*
		 //case 2 - post increment
		int a = 10;
		int res = a++;
		System.out.println("post-increment");
		System.out.println("a= " + a);
		System.out.println("res= " + res); // print 10, increment will be happening after assignment
		
		// case 3 - pre increment
		int b = 10;
		int result = ++b;
		System.out.println("pre-incrment");
		System.out.println("a= " + b);
		System.out.println("result= " + result); // print 10, increment will be happening before assignment
		*/
		
		/* 4B Decrement Operator 
		// is a means by which we deduct 1 from a variable value
		
		int c = 10;
	
		System.out.println("Before Decrement " + c);
		c--;
		System.out.println("After Decrement " + c);
		*/
		// case - 3 post decrement
		int c = 10;
		int sub = c--;
		
		System.out.println("post-decrement");
		System.out.println("c= " + c);
		System.out.println("sub= " + sub); // print 10, decrement will be happening after assignment
		
		// case - 4 predecrement
		int d = 10;
		int substruct = --d;
		System.out.println("pre-decrement");
		System.out.println("d= " + d);
		System.out.println("substruct= " + substruct); // print 9, decrement will be happening before assignment
	
	}

}
