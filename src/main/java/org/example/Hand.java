package org.example;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> newHand = new ArrayList<>();

    public void addCard(Card c){
        newHand.add(c);
    }

    @Override
    public String toString() {
        return newHand.toString();
    }

    public Card getCard(int card){
       return newHand.get(card);
    }

    public Card playCard(Card cardToPlay){

        if (newHand.contains(cardToPlay)) {
            newHand.remove(cardToPlay);
            return cardToPlay;
        }
        else{
            System.out.println("Card doesn't exist in hand");
        }
        return null;
    }

}
