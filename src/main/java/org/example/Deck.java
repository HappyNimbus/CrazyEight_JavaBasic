package org.example;

import java.util.ArrayList;
import java.util.*;

public class Deck {

    ArrayList<Card> newDeck;


    public Deck(){
        newDeck = new ArrayList<>();

        for(Card.Suit s : Card.Suit.values()){
            for(Card.Rank r : Card.Rank.values()){
                newDeck.add(new Card(s, r));
            }
        }
    }

    void shuffleDeck(){
        Collections.shuffle(newDeck);
    }

}
