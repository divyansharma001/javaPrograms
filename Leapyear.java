//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        System.out.println("Enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("The year is a leap year");
        } else{
            System.out.println("The year is not a leap year");
        }
    }
}
