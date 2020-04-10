package org;
//Self-Review Exercises. 3.5.3: ExerciseFor53.java

public class ExerciseFor53 {
    public static void main (String[] args) {

        int sum = 0;
        for (int count = 1; count <= 99; count += 2) {
            sum += count;
            System.out.printf(" %d ", sum);
        }
        
        System.out.println();
    }
}
