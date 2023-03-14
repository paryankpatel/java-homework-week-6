package homework;

import java.util.Scanner;

// Write a program to convert the upper case to lower case.
public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string in uppercase : ");
        String uppercasestring = input.nextLine();
        String lowercasestring = uppercasestring.toLowerCase();

        System.out.println("The string in lowecase is: " + lowercasestring);


    }
}
