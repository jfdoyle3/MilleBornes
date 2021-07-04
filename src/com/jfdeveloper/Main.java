package com.jfdeveloper;

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Distance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Card> deck=new ArrayList<>();
        System.out.println("reveal a card");

        Card twentyFiveMiles=new Distance(true,"25m",101,25);
        Card fiftyMiles=new Distance(false,"50m",102,50);

//        for (int card=0; card<3; card++){
//            deck.add(twentyFiveMiles);
//            deck.add(fiftyMiles);
//        }
        System.out.println(twentyFiveMiles.toString());
        System.out.println(twentyFiveMiles.getCardFace());
        System.out.println(((Distance) twentyFiveMiles).getDistance());

//        System.out.println(deck);
//
//        for(Card card : deck){
//            card.flip();
//            System.out.println(card.getCardFace());
//        }




    }
}
