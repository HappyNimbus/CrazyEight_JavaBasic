package org.example;

import java.util.Stack;

public class Table {

    Stack<Card> inPlayCards = new Stack<>();

    public void addToPlay(Card c){
        inPlayCards.add(c);

    }
    @Override
    public String toString() {
        return inPlayCards.toString();
    }
}
