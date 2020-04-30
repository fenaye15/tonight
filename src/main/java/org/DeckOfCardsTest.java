package org;
//Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing
public class DeckOfCardsTest {
    // execute application
    public static void main(String[] args) {
        DeckofCards myDeckOfCards = new DeckofCards();
        myDeckOfCards.shuffle();

        // print all
        for (int i = 1; i <= 52; i++) {
            //deal and display
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
