package org.example;

public class Card {


    Suit _suit;
    Rank _rank;

    public enum Suit{
        HEART, SPADE, CLUB, DIAMOND
    }

    public enum Rank{
        ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO, ONE
    }

    public Card(Suit suit, Rank rank){
        setRank(rank);
        setSuit(suit);
    }

    void setSuit (Suit suit){
        _suit = suit;
    }

    void setRank(Rank rank){
        _rank = rank;
    }

    Suit getSuit(){
        return _suit;
    }

    Rank getRank(){
        return _rank;
    }

    public String toString(){
        return getSuit() + ": " + getRank();
    }


}
