import java.util.Scanner;

public class Greetings{
    public static void main(String[] args){
        System.out.print("Enter you name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " +  name + ", Welcome to Earth!");
    }
}