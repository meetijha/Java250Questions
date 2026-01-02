package DSA_And_Basics;

public class Q013_StringReverse {

    public static void main(String[] args) {
        String str="I am a student";
        String revString=reverseString(str);
        System.out.println(revString);
    }

    public static String reverseString(String str)
    {
        String revString="";
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            revString=str.charAt(i)+revString;
        }
        return revString;
    }
}
