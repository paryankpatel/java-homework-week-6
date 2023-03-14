package homework;

import java.util.Scanner;

// Write a program to calculate the area of a triangle.
public class Question_8 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the base of the triangle : ");
         double base = scanner.nextDouble();
         System.out.println("Enter the height of the triangle : ");
         double height = scanner.nextDouble();

         double area = (base * height) / 2;

         System.out.println("The area of the triangle is : " + area);


     }
}
