import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter +, -, *, / to perform operation: ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println("The sum is: " + (num1 + num2));
        } else if (operator.equals("*")) {
            System.out.println("The product is : " + (num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println("The remainder is : " + (num1 / num2));
        } else {
            System.out.println("Enter a valid command");
        }
    }
}
