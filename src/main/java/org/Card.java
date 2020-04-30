package org;
// Fig. 7.9: Card.java
// Card class represents a playing card.
public class Card {
    private final String face;
    private final String suit;

    // two-argument constructor
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    // return String
    public String toString() {
        return face + " of " + suit;
    }
}
