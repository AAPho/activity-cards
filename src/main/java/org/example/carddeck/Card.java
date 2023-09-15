package org.example.carddeck;

public class Card {

    private Suit suit;
    private FaceValue value;

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }
}