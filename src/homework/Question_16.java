package homework;

import java.util.Scanner;

/* Write a Java program to add two binary numbers.

 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:

 * Sum of two binary numbers: 101

 */
  public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first binary number :");
        String binary1 = input.nextLine();

        System.out.println("Input second binary number :");
        String binary2 = input.nextLine();

        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2,2);

        int sum = number1 + number2;

        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers :" + binarySum);

    }

}
