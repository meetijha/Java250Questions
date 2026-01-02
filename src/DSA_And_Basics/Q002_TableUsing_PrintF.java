package DSA_And_Basics;

/*✅Table of a number using printf
Print  lines of output; each line  (where ) contains the  table  in the form:
N x i = result.
Sample Input
2
Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/

import java.util.Scanner;

public class Q002_TableUsing_PrintF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= scanner.nextInt();
        // %d is placeholde for integer, \n is for new line
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n",num,i,(num*i));
        }

        //Close scanner class
        scanner.close();
    }
}
