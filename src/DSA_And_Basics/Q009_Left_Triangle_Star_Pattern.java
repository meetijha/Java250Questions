package DSA_And_Basics;

/*✅ Left Triangle Star Pattern

        *****
        ****
        ***
        **
        *
 */

import java.util.Scanner;

public class Q009_Left_Triangle_Star_Pattern {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows of triangle");
        int row = s.nextInt();

        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* "); // Print is used here rather than println
            System.out.println();// println is used here because we want new line
        }
        s.close();
    }

}
