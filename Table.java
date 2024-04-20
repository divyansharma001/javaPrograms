import java.util.Scanner;

// Take a number as input and print the multiplication table for it
public class Table {
    public static void main(String[] args){
        System.out.println("Enter the number to print the table of it: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println( num + "x" + i + "=" + num*i );
        }
    }
}
