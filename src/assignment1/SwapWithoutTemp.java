package assignment1;

public class SwapWithoutTemp {
	public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        /*
         Explanation:
    		After a = a + b, a becomes the sum of both variables.
    		Then, b = a - b assigns the original value of a to b.
    		Finally, a = a - b assigns the original value of b to a.
         */
    }

}
