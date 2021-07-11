package com.jfdeveloper.ui;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.List;

public class Console {


    public static void showDistance(List<Card> cards) {
        int dist=0;
        for(Card card : cards){
            if (card instanceof Distance)
                dist+= ((Distance) card).getDistance();
        }

        System.out.printf("\n\ntotal distance: %d miles",dist);
    }

    public static void displayCards(List<Card> cards){
        for (Card card : cards)
            System.out.printf(" %s",card.getCardFace());
    }
}
