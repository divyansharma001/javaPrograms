//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is largest.");
        } else{
            System.out.println(num2 + " is largest.");
        }
    }
}
