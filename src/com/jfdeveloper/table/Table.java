package com.jfdeveloper.table;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;
import com.jfdeveloper.card.DistanceCard;
import com.jfdeveloper.deck.Deck;
import com.jfdeveloper.ui.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;

import static com.jfdeveloper.ui.Console.displayCards;

public class Table {


    private static ArrayList<Card> distancePile;
    private static ArrayList<Card> battlePile;
    private static ArrayList<Card> speedPile;
    private static ArrayList<Card> hand;


    public static void playGame() {

        List<Card> deck = Deck.buildDeck();
        Collections.shuffle(deck);

        hand=new ArrayList<Card>();

        for(int crd=0; crd<6; crd++)
            hand.add(deck.get(crd));

        Console.displayCards(hand);


    }






}

