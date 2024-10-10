package assignment1;

public class SwapVariables {
	
	public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
