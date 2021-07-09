package com.jfdeveloper;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }



    private static void makeDeck(List<Card> deck, Card card1, Card card2) {
        for (int card=0; card<3; card++){
            deck.add(card1);
            deck.add(card2);
        }
    }
}
