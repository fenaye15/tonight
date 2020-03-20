package org;
import java.util.Scanner;
public class Addition{
    public static void main (final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        final int number1 = input.nextInt();
        System.out.print("Enter second integer:");
        final int number2 = input.nextInt();
        final int sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);
        input.close();
    }
}
