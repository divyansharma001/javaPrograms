import java.util.Scanner;

public class finalCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '*' || op == '/' || op == '-' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op=='+'){
                    ans = num1 + num2;
                }
                if(op=='-'){
                    ans = num1 - num2;
                }
                if(op=='*'){
                    ans = num1*num2;
                }
                if(op=='/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }
                }
                if(op=='%'){
                    ans = num1 % num2;
                }
                System.out.println("Result: " + ans);

            } else if (op == 'x' || op == 'X'){
                System.out.println("Exiting the calculator program.");
                break;
            
            } else{
                System.out.println("Enter Valid Character");
            }
        }
       

    }
}
