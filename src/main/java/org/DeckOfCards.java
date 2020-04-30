package org;
// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;
public class DeckOfCards {
    //random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    //constructor fills deck of cards
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //populate deck
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }



    // shuffle deck of cards
public void shuffle() {
    // next call to method dealCard
    currentCard = 0;

    // for each Card, pick another random card and swap them
    for (int first = 0; first < deck.length; first++) {
        // select a random number between 0 and 51
        int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

        //swap current Card
        Card temp = deck[first];
        deck[first] = deck[second];
        deck[second] = temp;
    }
}

// deal one card
public Card dealCard() {
    // determine whether Cards remain to be dealt
    if (currentCard < deck.length) {
        return deck[currentCard++]; 
    }
    else {
        return null;
    }
}
}
