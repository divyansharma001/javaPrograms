import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        System.out.println("Enter another number: ");
        int input2 = input.nextInt();
        int sum = input1 + input2;
        System.out.println("Sum is " + sum);
    }
}