package DSA_And_Basics;

import java.util.Arrays;

public class Q015_Anagrams {
    public static void main(String[] args) {
        String str1="Ra-ce";
        String str2="care";

        System.out.println("Strings are "+isAnagram(str1,str2));
    }

    public static String isAnagram(String str1, String str2){


            str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
            str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if(str1.length()==str2.length())
                return "Not Anagrams";

            char[] str1Char = str1.toCharArray();
            char[] str2Char = str2.toCharArray();

            Arrays.sort(str1Char);
            Arrays.sort(str2Char);

            for(int i=0;i<str1.length();i++)
            {
                if(str1Char[i]!=str2Char[i])
                    return "Not Anagram";
            }
                return "Anagrams";


    }
}
