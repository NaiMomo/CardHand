package com.Hand;

// card class holding suit and rank properties
public class Card {
    // data members
    private String suit;
    private String rank;

    // constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // suit getter
    public String getSuit() {
        return suit;
    }

    // suit setter
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // rank getter
    public String getRank() {
        return rank;
    }

    // rank setter
    public void setRank(String rank) {
        this.rank = rank;
    }

    // toString method to returning string
    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
