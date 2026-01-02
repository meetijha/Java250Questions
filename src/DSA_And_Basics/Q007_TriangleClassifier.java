package DSA_And_Basics;

/*✅ Triangle Classifier:

Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is
equilateral (all sides are equal),
isosceles (exactly two sides are equal),
or scalene (no sides are equal).
Use an if-else statement to classify the triangle.*/

import java.util.Scanner;


public class Q007_TriangleClassifier {

    public static String classifyTriange(int a, int b, int c) {
        String triangleType = "";
        if (a == b && b == c) triangleType = "Equilateral";
        else if (a == b || b == c || a == c) triangleType = "Isosceles";
        else triangleType = "Scalane";
        return triangleType;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter size of side 1");
        a = s.nextInt();
        System.out.println("Enter size of side 2");
        b = s.nextInt();
        System.out.println("Enter size of side 3");
        c = s.nextInt();

        System.out.println("Triangle is " + classifyTriange(a, b, c));
        s.close();
    }
}
