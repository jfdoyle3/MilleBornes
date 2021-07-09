package com.jfdeveloper.deck;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.ArrayList;
import java.util.List;

public class DistanceDeck {

    private List<Card> distanceDeck=new ArrayList<>();


    public  void buildDeck() {
        for (int crd = 0; crd < 10; crd++) {
            distanceDeck.add(new Distance(true, "25m", 25));
            distanceDeck.add(new Distance(true, "50m", 50));
            distanceDeck.add(new Distance(true, "75m", 75));
        }
        for (int crd = 0; crd < 12; crd++)
            distanceDeck.add(new Distance(true, "100m", 100));

        for (int crd = 0; crd < 4; crd++)
            distanceDeck.add(new Distance(true, "200m", 200));

    }



    public void displayDeck() {
        for (Card card : distanceDeck)
            System.out.printf("card: %s | ", card.getCardFace());
    }
}
