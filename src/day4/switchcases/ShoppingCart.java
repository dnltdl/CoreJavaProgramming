package day4.switchcases;

public class ShoppingCart {
    public static void main(String[] args) {
        String couponCode = "WINTER20";
        double totalAmount = 250.0;
        double discount = 0.0;

        switch (couponCode) {
            case "SUMMER10":
                discount = 0.10;
                break;
            case "FALL15":
                discount = 0.15;
                break;
            case "WINTER20":
                discount = 0.20;
                break;
            default:
                System.out.println("Invalid coupon code.");
        }

        if (discount > 0) {
            double discountedAmount = totalAmount - (totalAmount * discount);
            System.out.println("Coupon applied! Final amount after discount: $" + discountedAmount);
        } else {
            System.out.println("No discount applied. Total amount: $" + totalAmount);
        }
    }

}
