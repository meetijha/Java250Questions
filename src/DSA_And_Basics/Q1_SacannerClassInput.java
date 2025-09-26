package DSA_And_Basics;
import java.util.Scanner;

//1. How to Take Input from Users?
//You can take input from users using the Scanner class

public class Q1_SacannerClassInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner s= new Scanner(System.in);

        //Prompt user for input
        System.out.println("Enter your name");
        // Read a line of text entered by the user
        String name = s.nextLine();

        // Prompt the user for a number
        System.out.println("Enter your age:");
        // Read an integer entered by the user
        int age = s.nextInt();

        //Display user input
        System.out.println("Your name is "+name +" and your age is "+age);

        //Close the Scanner class to release resources
        s.close();
    }
}
