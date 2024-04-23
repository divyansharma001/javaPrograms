import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        System.out.print("Enter the character: ");
        Scanner input = new Scanner(System.in);
        char letter = input.next().trim().charAt(0);

        if(letter>='a' && letter <='z'){
            System.out.println("The letter is lowercase");
        } else {
            System.out.println("The letter is uppercase");
        }

    }
}
