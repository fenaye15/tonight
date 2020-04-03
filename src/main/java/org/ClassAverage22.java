package org;
// Fig. 4.10: ClassAverage22.java
import java.util.Scanner;

public class ClassAverage22 {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        //initialization phase
        int total = 0;
        int gradeCounter = 0; //initialize # of grades so far

        //processing phase
        //prompt for input
        System.out.print("Enter grade or -1 to quit:");
        int grade = input.nextInt();

        //loop until sentinel value read from user
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            //prompt for input
            System.out.print("Enter grade or -1 to quit:");
            grade = input.nextInt();
        }

        //termination phase

        if (gradeCounter != 0) {
            //use number with decimal point
            double average = (double) total / gradeCounter;

            //display total and average
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else { // no grades were entered
            System.out.println("No grades were entered");
            input.close();
        }
    }
}
