package com.jfdeveloper;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;
import com.jfdeveloper.deck.DistanceDeck;
import com.jfdeveloper.deck.HazardDeck;
import com.jfdeveloper.deck.RemedyDeck;
import com.jfdeveloper.deck.SafetyDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = new ArrayList<>();


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

        Collections.shuffle(deck);

        for (Card card : deck)
            System.out.println(card);

    }


    private static void makeDeck(List<Card> deck, Card card1, Card card2) {
        for (int card = 0; card < 3; card++) {
            deck.add(card1);
            deck.add(card2);
        }
    }
}
