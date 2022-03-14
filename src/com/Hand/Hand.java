package com.Hand;

public class Hand {
    // hand containing 4 fingers having specific cards
    LinkedPositionalList<Card> heartFinger = new LinkedPositionalList<>(); // positional list containing heart cards only
    LinkedPositionalList<Card> clubFinger = new LinkedPositionalList<>();// positional list containing club cards only
    LinkedPositionalList<Card> spadeFinger = new LinkedPositionalList<>();// positional list containing spade cards only
    LinkedPositionalList<Card> diamondFinger = new LinkedPositionalList<>();// positional list containing diamond cards only

    // constructor
    public Hand() {
    }

    // getter methods
    public LinkedPositionalList<Card> getHeartFinger() {
        return heartFinger;
    }

    public LinkedPositionalList<Card> getClubFinger() {
        return clubFinger;
    }

    public LinkedPositionalList<Card> getSpadeFinger() {
        return spadeFinger;
    }

    public LinkedPositionalList<Card> getDiamondFinger() {
        return diamondFinger;
    }

}
