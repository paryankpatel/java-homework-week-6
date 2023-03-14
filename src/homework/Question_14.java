package homework;
/* Write a Java program to print the area and perimeter of a rectangle.

 * Test Data:
 * Width = 5.5 Height = 8.5

 * Expected Output:

 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20

 */

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle : ");
        double width = input.nextDouble();
        System.out.println("Enter the height of the rectangle : ");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = (width + height) * 2;

        System.out.println("Area is : (width * height)");
        System.out.println("perimeter is : (width + height) * 2");

    }
}
