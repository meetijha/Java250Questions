package DSA_And_Basics;

import java.util.Scanner;

/*✅ Pyramid pattern in Java

    *
   ***
  *****
 *******
*********
*/

public class Q10_Pyramid_Pattern_Triangle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows of pyramid ");
        int rows=s.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=2*rows-1;j++)
            {
                if(j>=(rows-(i-1))&& j<=(rows+(i-1)))
                    System.out.print("*");
               else System.out.print(" ");
            }
            System.out.println();
        }

/*        Another approach using 3 for loop
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }*/
        s.close();
    }
}
