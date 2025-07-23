package org.example;

import java.util.*;

public class Deck {

    Stack<Card> newDeck;


    public Deck(){
        newDeck = new Stack<>();

        for(Card.Suit s : Card.Suit.values()){
            for(Card.Rank r : Card.Rank.values()){
                newDeck.add(new Card(s, r));
            }
        }
    }

    void shuffleDeck(){
        Collections.shuffle(newDeck);
    }

    public Card dealCard(){
        if(newDeck.isEmpty()){
            return null;
        }
        else {
            Card deltCard = newDeck.pop();
            return deltCard;
        }
    }

}
