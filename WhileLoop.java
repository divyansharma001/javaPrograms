import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        System.out.println("Enter the number (use x to exit): ");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            if(input.hasNextInt()){
                int num = input.nextInt();
                sum = sum + num;
            } else{
                String exit = input.next();
                if(exit.equalsIgnoreCase("x"))
                break;
                else{
                    System.out.println("Invalid value please enter a number or enter x to exit");
                    continue;
                }
            }
        }
        System.out.println("the value of sum is " + sum);
    }
}
