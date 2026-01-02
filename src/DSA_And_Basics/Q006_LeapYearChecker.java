package DSA_And_Basics;

/*
✅ Leap Year Checker:
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
*/

import java.util.Scanner;

public class Q006_LeapYearChecker {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter year");
        int year=s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("It is a leap year");
        else System.out.println("It is not a leap year");

        // Below statement can also be used to test
        //xor gate returns 0 if both bita are same and 1 otherwise.
        // so negative of xor gate is used here so that if 1 is true other also has to be true
        //can be checked in case of divisible by 100 as well as 400

        //if(year%4==0 && !(year%100==0 ^ year%400==0))

        s.close();
    }
}
