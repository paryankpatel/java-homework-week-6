package homework;

import java.util.Scanner;

/* Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.

 */
public class Question_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = input.nextInt();
        System.out.println("Enter the second number : ");
        int b = input.nextInt();
        System.out.println("Enter the third number : ");
        int c = input.nextInt();

        System.out.println("Average of number 1, number 2, number 3 is " + (a+b+c) / 3);



    }
}
