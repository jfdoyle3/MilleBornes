package com.jfdeveloper.deck;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.ArrayList;
import java.util.List;

public class DistanceDeck extends Deck {

    public static List<Card> distanceDeck=new ArrayList<>();

    public DistanceDeck(Card card) {
        super(card);
    }


    public static List<Card> buildDistanceDeck(Boolean faceUpDown) {

        for (int crd = 0; crd < 10; crd++) {
            distanceDeck.add(new Distance(faceUpDown, "[25m]", 25));
            distanceDeck.add(new Distance(faceUpDown, "[50m]", 50));
            distanceDeck.add(new Distance(faceUpDown, "[75m]", 75));
        }
        for (int crd = 0; crd < 12; crd++)
            distanceDeck.add(new Distance(faceUpDown, "[100m]", 100));

        for (int crd = 0; crd < 4; crd++)
            distanceDeck.add(new Distance(faceUpDown, "[200m]", 200));

        return distanceDeck;

    }



    public static void displayDeck() {
        for (Card card : distanceDeck)
            System.out.printf("card: %s | ", card.getCardFace());
    }
}
