// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
       int a = 0;
       int b = 1;
       int c;
       int terms;
       System.out.print("Enter the number of terms: ");
       Scanner input = new Scanner(System.in);
       terms = input.nextInt();

       for(int i=0; i<=terms; i++){
        System.out.print(a + " "); //0
        c=a+b; //1
        a=b; //1
        b=c; //1
       }
        
    }
}
