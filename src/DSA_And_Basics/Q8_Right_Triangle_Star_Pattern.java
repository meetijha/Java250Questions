package DSA_And_Basics;
import java.util.Scanner;
/*✅ Right Triangle Star Pattern

        *
        **
        ***
        ****
        ******/

public class Q8_Right_Triangle_Star_Pattern {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows of triangle");
        int row = s.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* "); // Print is used here rather than println
            System.out.println();// println is used here because we want new line
        }
        s.close();
    }
}
