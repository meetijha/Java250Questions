package DSA_And_Basics;

import java.util.Scanner;

public class Q11_PrimeNumberChecker {
    public static boolean isPrime(int num)
    {
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0 || num%3==0) return false;

        for(int i=5;i<=Math.sqrt(num);i+=6) {
            if (num % i == 0) return false;
        }
         return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= scanner.nextInt();

        if(isPrime(num))
            System.out.println("Number is Prime");
        else System.out.println("Number is not prime");

        scanner.close();
    }


}
