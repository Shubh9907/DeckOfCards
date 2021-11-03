package com.bridgelabz;

public class DeckofCards {
    private Integer[] deckOrder;
    private UniqueCard[] cards;

    public DeckofCards() {
        deckOrder = new Integer[52];
        cards = new UniqueCard[52];
        for (int i = 0; i < deckOrder.length; i++) {
            deckOrder[i] = i;
            cards[i] = new UniqueCard(i / 13, i % 13);
        }
    }
}
