package com.bridgelabz;

public class UniqueCard {
    public final static String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public final static String[] card = {"Ace", "King", "Queen", "Jack", "Ten", "Nine"
            , "Eight", "Seven", "Six", "Five", "Four"
            , "Three", "Two"};
    
    public UniqueCard(int suit1, int card1) {
        String uniCard=suit[suit1]+ " " +card[card1];
    }
}
