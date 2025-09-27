package DSA_And_Basics;
import java.util.Scanner;

public class Q11_Count_Vowels_and_Consonants {

    public static int[] countVowelsAndConsonants(String str)
    {
        int vCount=0;
        int cCount=0;
        String strLwr=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vCount++;
            else if(ch>'a' && ch<='z' ) cCount++;
        }
        return new int[]{vCount,cCount};
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        int[] Count=countVowelsAndConsonants(str);
        System.out.println("Number of vowels in string are "+Count[0]);
        System.out.println("Number of consonents in string are "+Count[1]);
        s.close();
    }
}
