package homework;

import java.util.Scanner;

/* Write a program to insert any temperature value in degree Fahrenheit and
 *convert to degree Celsius ((F − 32) × 5/9 = 0°C).

 */
public class Question_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value in Fahrenheit = " );
        int F = scanner.nextInt();
        System.out.println("Temperature value in Celsius is = " + (F - 32) * 5/9);


    }

}
