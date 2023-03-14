package homework;
// Write a Java program to swap two variables.

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first variable : ");
        int a = input.nextInt();

        System.out.println("Enter the second variable : ");
        int b = input.nextInt();

        System.out.println(" Before swapping :");
        System.out.println("Variable a =" + a);
        System.out.println("Variable b =" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping:");
        System.out.println("a"+"=" + a);
        System.out.println("b"+"="+ b);


    }


}
