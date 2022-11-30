package com.jfdeveloper.hand;

import com.jfdeveloper.card.Card;

public class Hand {

//    public Hand(Actor holder) {
//        this.holder = holder;
//    }

    public void addCard(Card card) {
        java.lang.Object cards = null;
        cards.add(card);
    }

    public String displayHand() {
        StringBuilder output = new StringBuilder();
        Card[] cards;
        for (Card card : cards) {
            output.append(card.display()).append(" ");
        }

        return output.toString().trim();
    }
}
