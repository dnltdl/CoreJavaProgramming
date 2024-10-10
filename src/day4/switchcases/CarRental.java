package day4.switchcases;

public class CarRental {
    public static void main(String[] args) {
        String carType = "SUV";
        double rentalCost;

        switch (carType) {
            case "Sedan":
                rentalCost = 50.0;
                break;
            case "SUV":
                rentalCost = 75.0;
                break;
            case "Truck":
                rentalCost = 90.0;
                break;
            default:
                rentalCost = 60.0;
                System.out.println("Car type not recognized. Assigning default rental cost.");
        }

        System.out.println("The rental cost for a " + carType + " is $" + rentalCost + " per day.");
    }

}
