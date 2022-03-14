package com.Hand;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardHand cardHand = new CardHand();

        //adding few cards by default
        cardHand.addCard(Suits.Club.toString(), "1");
        cardHand.addCard(Suits.Club.toString(), "2");

        cardHand.addCard(Suits.Spade.toString(), "1");
        cardHand.addCard(Suits.Spade.toString(), "2");

        cardHand.addCard(Suits.Diamond.toString(), "1");
        cardHand.addCard(Suits.Diamond.toString(), "2");

        cardHand.addCard(Suits.Heart.toString(), "1");
        cardHand.addCard(Suits.Heart.toString(), "2");

        menu(cardHand);
    }

    private static void menu(CardHand cardHand) {
        // scanner to take input
        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("\n1. Add Card");
            System.out.println("2. Play Card");
            System.out.println("3. Iterator for all cards");
            System.out.println("4. Iterator for suit");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter card suit : ");
                    String suit = scanner.next();
                    System.out.print("Enter card rank : ");
                    String rank = scanner.next();

                    cardHand.addCard(suit, rank);
                    break;
                case 2:
                    System.out.print("Enter card suit : ");
                    String cSuit = scanner.next();
                    Card play = cardHand.play(cSuit);
                    if (play != null) {
                        System.out.println(play + " is played.");
                    } else {
                        System.out.println(cSuit + " is not played.");
                    }
                    break;
                case 3:
                    System.out.println("Iterating over cards");
                    Iterator<Card> iterator = cardHand.iterator();
                    if (iterator != null) {
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    } else {
                        System.out.println("No card left in hand");
                    }
                    break;
                case 4:
                    System.out.print("Enter card suit : ");
                    String iSuit = scanner.next();
                    System.out.println("Iterating over " + iSuit);
                    Iterator<Card> cardIterator = cardHand.suitIterator(iSuit);
                    if (cardIterator != null) {
                        while (cardIterator.hasNext()) {
                            System.out.println(cardIterator.next());
                        }
                    } else {
                        System.out.println("No " + iSuit + " Card left in hand");
                    }
                    break;
                case 5:
                    System.out.println("System is exiting..");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Please choose from 1 to 5");
                    break;
            }
        }
    }
}
