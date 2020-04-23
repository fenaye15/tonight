package org;  // Fig. 6.8: Craps.java
// Craps class simultes the dice game craps.
import java.security.SecureRandom;

public class Craps {
    //create
    private static final SecureRandom randomNumbers = new SecureRandom();

    //enum
    private enum Status {CONTINUE, WON, LOST};

    //constants
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    //plays
    public static void main(String[] args) {
        int myPoint = 0; //point
        Status gameStatus; //can contain CONTINUE, WON, LOST

        int sumofDice = rollDice();

        //determine game status
        switch (sumofDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumofDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        //while game is not complete
        while (gameStatus == Status.CONTINUE) {
            sumofDice = rollDice();

            //determine game status
            if (sumofDice == myPoint) {
                gameStatus = Status.WON;
            }
            else {
                if (sumofDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

        //display
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        }
        else {
            System.out.println("Player loses");
        }
    }

    // roll dice
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        //display results
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
