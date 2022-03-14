# CardHand

Implement a CardHand class that supports a person arranging a group of cards in </br>
his or her hand. The simulator should represent the sequence of cards using a</br>
single positional list ADT (use the one that developed in the class) so that cards of</br>
the same suit are kept together. Implement this strategy by means of four</br>
“Fingers” into the hand, one for each of the suits of hearts, clubs, spades, and</br>
diamonds, so that adding a new card to the person’s hand or playing a correct</br>
card from the hand can be done in constant time. The class should support the</br>
following methods:</br>
- addCard(r,s): add a new card with rank r and suit s to the hand.</br>
- Play(s): remove and return a card of suit s from the player’s hand; if there is</br>
no card of suit s, then remove and return an arbitrary card from the hand.</br>
- Iterator(): return an iterator for all cards currently in the hand.</br>
- suitIterator(s): return an iterator for all cards of suit s that are currently in</br>
the hand.</br>

write a good menu, and implement createCard(r,s) function and add it</br>
to your class. This function will create a new card with rank r, and suit s to</br>
the hand.</br>
