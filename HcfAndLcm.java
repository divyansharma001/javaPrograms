import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args){
        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int on1 = num1;
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int on2 = num2;

        while(num1%num2 !=0){
            num2= num1%num2;
            num1= num2;

        }
        int gcd = num2;
        int lcd = (on1*on2)/gcd;
        System.out.println("LCM is " + lcd + "and HCF is " + gcd);
    }
}
