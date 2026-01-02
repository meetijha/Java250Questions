package DSA_And_Basics;

public class Q014_RemoveDuplicateLetters {

    public static void main(String[] args) {
        String str="Hello world";
        System.out.println(removeDuplicateLetters(str));
    }

    public static String removeDuplicateLetters(String str)
    {
        String tempStr="";
        {
            for(int i=0;i<str.length();i++)
            {
                if(tempStr.indexOf(str.charAt(i))==-1)
                {
                    tempStr=tempStr +str.charAt(i);
                }
            }
            return tempStr;
        }
    }
}
