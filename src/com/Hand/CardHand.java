package com.Hand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// card hand class to handle cards and different operations
public class CardHand {
    // data member
    Hand hand = new Hand();

    // constructor
    public CardHand() {
    }

    // add card method
    public void addCard(String s, String r) {
       createCard(s,r);
    }

    public void createCard(String s, String r) {
        if (s.equalsIgnoreCase(Suits.Club.toString())) { // checking if the given suit is club
            hand.getClubFinger().addFirst(new Card(Suits.Club.toString(), r)); // adding card to finger containing club cards
            System.out.println("Card is added");
        } else if (s.equalsIgnoreCase(Suits.Diamond.toString())) { // checking if the given suit is Diamond
            hand.getDiamondFinger().addFirst(new Card(Suits.Diamond.toString(), r));// adding card to finger containing diamond cards
            System.out.println("Card is added");
        } else if (s.equalsIgnoreCase(Suits.Spade.toString())) {// checking if the given suit is spade
            hand.getSpadeFinger().addFirst(new Card(Suits.Spade.toString(), r));// adding card to finger containing spade cards
            System.out.println("Card is added");
        } else if (s.equalsIgnoreCase(Suits.Heart.toString())) {// checking if the given suit is heart
            hand.getHeartFinger().addFirst(new Card(Suits.Heart.toString(), r));// adding card to finger containing heart cards
            System.out.println("Card is added");
        } else { // if the given suit doesn't follow the suits
            System.out.println("Please provide valid card suit");
        }
    }

    // method that returns iterator containing all cards
    public Iterator<Card> iterator() {
        ArrayList<Card> cards = new ArrayList<>();

        // adding heart cards to list
        LinkedPositionalList<Card> heartFinger = hand.getHeartFinger();
        if (!heartFinger.isEmpty()) { // checking if the heart cards is not empty
            for (Card card : heartFinger) {
                cards.add(card);
            }
        }

        // adding spade cards to list
        LinkedPositionalList<Card> spadeFinger = hand.getSpadeFinger();
        if (!spadeFinger.isEmpty()) {// checking if the spade cards is not empty
            for (Card card : spadeFinger) {
                cards.add(card);
            }
        }

        // adding diamond cards to list
        LinkedPositionalList<Card> diamondFinger = hand.getDiamondFinger();
        if (!diamondFinger.isEmpty()) {// checking if the diamond cards is not empty
            for (Card card : diamondFinger) {
                cards.add(card);
            }
        }

        // adding club cards to list
        LinkedPositionalList<Card> clubFinger = hand.getClubFinger();
        if (!clubFinger.isEmpty()) {// checking if the club cards is not empty
            for (Card card : clubFinger) {
                cards.add(card);
            }
        }

        return cards.listIterator(); // returning iterator
    }

    // method returning iterator of the given suit
    public Iterator<Card> suitIterator(String suit) {
        // checking if the given suit is heart
        if (suit.equalsIgnoreCase(Suits.Heart.toString())) {
            LinkedPositionalList<Card> heartFinger = hand.getHeartFinger();
            if (heartFinger.isEmpty()) { // checking if the heart list is empty
                return null;
            } else {
                return heartFinger.iterator(); // returning iterator of heart cards
            }
            // checking if the given suit is spade
        } else if (suit.equalsIgnoreCase(Suits.Spade.toString())) {// checking if the spade list is empty
            LinkedPositionalList<Card> spadeFinger = hand.getSpadeFinger();
            if (spadeFinger.isEmpty()) {
                return null;
            } else {
                return spadeFinger.iterator();// returning iterator of spade cards
            }
            // checking if the given suit is diamond
        } else if (suit.equalsIgnoreCase(Suits.Diamond.toString())) {
            LinkedPositionalList<Card> diamondFinger = hand.getDiamondFinger();
            if (diamondFinger.isEmpty()) {// checking if the diamond list is empty
                return null;
            } else {
                return diamondFinger.iterator();// returning iterator of diamond cards
            }
            // checking if the given suit is heart

        } else if (suit.equalsIgnoreCase(Suits.Club.toString())) {
            LinkedPositionalList<Card> clubFinger = hand.getClubFinger();
            if (clubFinger.isEmpty()) { // checking if the club list is empty
                return null;
            } else {
                return clubFinger.iterator(); // returning iterator of club cards
            }
        } else {
            System.out.println("Please provide valid card suit");
        }

        return null;
    }

    // play method to remove card from list
    public Card play(String s) {
        // checking if the suit given is club
        if (s.equalsIgnoreCase(Suits.Club.toString())) {
            if (hand.getClubFinger().isEmpty()) { // checking if the list is empty
                LinkedPositionalList<Card> validOne = getValidOne();
                return remove(validOne);
            } else {
                return remove(hand.getClubFinger()); // calling remove method
            }

            // checking if the suit given is diamond
        } else if (s.equalsIgnoreCase(Suits.Diamond.toString())) {
            if (hand.getDiamondFinger().isEmpty()) { // checking if the list is empty
                LinkedPositionalList<Card> validOne = getValidOne();
                return remove(validOne);
            } else {
                return remove(hand.getDiamondFinger()); // calling remove method
            }

            // checking if the suit given is spade
        } else if (s.equalsIgnoreCase(Suits.Spade.toString())) {
            if (hand.getSpadeFinger().isEmpty()) { // checking if the list is empty
                LinkedPositionalList<Card> validOne = getValidOne();
                return remove(validOne);
            } else {
                return remove(hand.getSpadeFinger()); // calling remove mehtod
            }

            // checking if the suit given is heart
        } else if (s.equalsIgnoreCase(Suits.Heart.toString())) {
            if (hand.getHeartFinger().isEmpty()) { // checking if the list is empty
                LinkedPositionalList<Card> validOne = getValidOne();
                return remove(validOne);
            } else {
                return remove(hand.getHeartFinger()); // calling remove method
            }
        }

        return null;
    }

    // method to remove card from the given list
    private Card remove(LinkedPositionalList<Card> finger) {
        Position<Card> position = null;
        // iterating over the list
        Iterable<Position<Card>> positions = finger.positions();
        for (Position<Card> p : positions) {
            position = p;
            break;
        }

        // getting card at position
        assert position != null;
        Card card = position.getElement();
        finger.remove(position);// removing card

        return card;
    }

    // getting valid random card
    private LinkedPositionalList<Card> getValidOne() {
        LinkedPositionalList<Card> random = null;
        boolean isValid = true;
        // loop till we get valid response i.e not null
        while (isValid) {
            random = getRandom();

            if (!random.isEmpty()) {
                isValid = false;
            }
        }

        return random;
    }

    // method getting random list
    private LinkedPositionalList<Card> getRandom() {
        // generating random number
        Random random = new Random();
        int r = random.nextInt(4);

        // returning list according to the given randomized number
        if (r == 0) {
            return hand.getClubFinger();
        } else if (r == 1) {
            return hand.getHeartFinger();
        } else if (r == 2) {
            return hand.getSpadeFinger();
        } else if (r == 3) {
            return hand.getDiamondFinger();
        }
        return null;
    }
}
