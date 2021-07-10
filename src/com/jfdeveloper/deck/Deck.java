package com.jfdeveloper.deck;

import com.jfdeveloper.card.Card;

public abstract class Deck implements iDeck {

    private Card card;

    public Deck(Card card) {
        this.card = card;
    }

}
