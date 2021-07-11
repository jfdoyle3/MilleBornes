package com.jfdeveloper.deck;

// Remedy CARDS: DRIVE, END OF SPEED LIMIT, GAS, SPARE TIRE, REPAIRS
// Hazard Cards: STOP, SPEED LIMIT(<=50m), OUT OF GAS, FLAT TIRE, ACCIDENT
// Remedies:  6 GASOLINE, 6 SPARE TIRE, 6 REPAIRS, 6 END OF SPEED LIMIT, 14 ROLL

// Remedy cancels hazard cards, resume play.

// TODO: try to tie in the hazard cards when played to flip from true to false


import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Remedy;

import java.util.ArrayList;
import java.util.List;

public class RemedyDeck extends Deck {

    private static List<Card> remedyDeck=new ArrayList<>();

    public RemedyDeck(Card card) {
        super(card);
    }

    public static List<Card> buildRemedyDeck(boolean faceUpDown) {
        for (int crd = 0; crd < 6; crd++) {
            remedyDeck.add(new Remedy(faceUpDown, "[GASOLINE]"));
            remedyDeck.add(new Remedy(faceUpDown, "[SPARE TIRE]"));
            remedyDeck.add(new Remedy(faceUpDown, "[REPAIRS]"));
            remedyDeck.add(new Remedy(faceUpDown, "[END OF SPEED LIMIT]"));
        }
        for(int crd=0; crd<14; crd++)
            remedyDeck.add(new Remedy(faceUpDown, "[ROLL]"));

        return remedyDeck;
    }
}
