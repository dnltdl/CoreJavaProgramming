package day4.switchcases;

public class PayrollSystem {
    public static void main(String[] args) {
    	
        String employeeRole = "Sales";
        double salary;

        switch (employeeRole) {
            case "Manager":
                salary = 70000;
                break;
            case "Developer":
                salary = 60000;
                break;
            case "Tester":
                salary = 50000;
                break;
            case "HR":
                salary = 45000;
                break;
            default:
                salary = 40000;
                System.out.println("Role not recognized, assigning default salary.");
        }

        System.out.println("The salary for " + employeeRole + " is $" + salary);
    }

}
