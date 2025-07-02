package org.example;

public class Main {
    public static void main(String[] args) {
        Engine newGame = new Engine();
        newGame.runGame();


        Card newCard = new Card(Card.Suit.HEART, Card.Rank.ACE);
        System.out.println(newCard);

    }
}
