package com.jfdeveloper.deck;

import com.jfdeveloper.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Deck implements iDeck {

    private Card card;
    private static List<Card> deck = new ArrayList<>();

    public Deck(Card card) {
        this.card = card;
    }

    public static List<Card> buildDeck(){

        List<Card> distDeck = DistanceDeck.buildDistanceDeck(true);
        List<Card> hazDeck = HazardDeck.buildHazardDeck(true);
        List<Card> remDeck = RemedyDeck.buildRemedyDeck(true);
        List<Card> safeDeck = SafetyDeck.buildSafetyDeck(true);

        for (Card card : distDeck)
            deck.add(card);

        for (Card card : hazDeck)
            deck.add(card);

        for (Card card : remDeck)
            deck.add(card);

        for (Card card : safeDeck)
            deck.add(card);

        return deck;
    }

}
