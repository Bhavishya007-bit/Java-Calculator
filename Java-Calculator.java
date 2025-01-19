import java.util.*;
public class HW1class3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the operation you want to proceed:");
        System.out.println("For addition(+) type - 1");
        System.out.println("For subtraction(-) type - 2");
        System.out.println("For multiplication(*) type - 3");
        System.out.println("For division(/) type - 4");
        System.out.println("For remainder/modulo (%) type - 5");

        int choice = sc.nextInt();
        double result;
        switch(choice) {
            case 1:
                result = a + b;
                System.out.println("Result of Addition: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result of Multiplication: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result of Modulo: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        

        }





        sc.close();
    }





}