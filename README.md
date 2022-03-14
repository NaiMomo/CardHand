# CardHand

Implement a CardHand class that supports a person arranging a group of cards in
his or her hand. The simulator should represent the sequence of cards using a
single positional list ADT (use the one that developed in the class) so that cards of
the same suit are kept together. Implement this strategy by means of four
“Fingers” into the hand, one for each of the suits of hearts, clubs, spades, and
diamonds, so that adding a new card to the person’s hand or playing a correct
card from the hand can be done in constant time. The class should support the
following methods:
 addCard(r,s): add a new card with rank r and suit s to the hand.
 Play(s): remove and return a card of suit s from the player’s hand; if there is
no card of suit s, then remove and return an arbitrary card from the hand.
 Iterator(): return an iterator for all cards currently in the hand.
 suitIterator(s): return an iterator for all cards of suit s that are currently in
the hand.

write a good menu (5%), and implement createCard(r,s) function and add it
to your class (10%). This function will create a new card with rank r, and suit s to
the hand. (Total 15%).
