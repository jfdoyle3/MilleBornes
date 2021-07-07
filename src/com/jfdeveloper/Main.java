package com.jfdeveloper;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Card> deck=new ArrayList<>();

        int[] ids={1,2,3,4,5};
        int[] dist={25,50,75,100,200};
        String[] face={"25m","50m","75m","100m","200m"};
        int[] cardCount={10,10,10,12,4};

        //Couple of Cards
        Card twentyFiveMiles=new Distance(true,"25m",101,25);
        Card fiftyMiles=new Distance(false,"50m",102,50);
        

        // Make a small deck
        // try a while loopto make a distance deck.


       // makeDeck(deck, twentyFiveMiles, fiftyMiles);

        // Output deck
        System.out.println(deck);


    }



    private static void makeDeck(List<Card> deck, Card card1, Card card2) {
        for (int card=0; card<3; card++){
            deck.add(card1);
            deck.add(card2);
        }
    }
}
