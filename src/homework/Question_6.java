package homework;
/* Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */


import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        double pi = 4.15;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any radius value = ");
        int r = scanner.nextInt();
        System.out.println("Area of the circle is = " + pi*r*r);

    }



}
