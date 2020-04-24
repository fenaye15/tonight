// Fig. 6.3: MaximumFinder.java

import java.util.Scanner;

public class MaximumFinder {
    public static void main (String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);

        //prompt
        System.out.print(
            "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //determine max value
        double result = maximum(number1, number2, number3);

        //display max
        System.out.println("Maximum is: " + result);
        input.close();
    }

    //returns the max
    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        //determine whether y is greater then maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }

        //determine whether z is greater then maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}
