package org.example;

public class Engine {
    void runGame(){
        System.out.println("Welcome to Crazy Eights \nThis game is similar to Uno! \nType Rules to check out the rules of the game \nType Start to start playing");

        Deck newDeck = new Deck();
        Hand newHand = new Hand();
        DiscardPile newPile = new DiscardPile();
        Table newTable = new Table();

        System.out.println("Shuffling deck...");
        System.out.println("...");
        newDeck.shuffleDeck();

        System.out.println("Dealing cards");
        System.out.println("...");

        for(int i = 0; i <= 5; i++) {
            newHand.addCard(newDeck.dealCard());
        }
        System.out.println(newHand);

        newTable.addToPlay(newHand.playCard(newHand.getCard(1)));

        System.out.println(newTable);

        System.out.println(newHand);



    }
}
