package com.jfdeveloper.deck;

// may have to enum these cards
// Hazard Cards: STOP, SPEED LIMIT(<=50m), OUT OF GAS, FLAT TIRE, ACCIDENT
// Remedy CARDS: DRIVE, END OF SPEED LIMIT, GAS, SPARE TIRE, REPAIRS
// Hazards:   3 OUT OF GAS, 3 FLAT TIRE, 3 ACCIDENTS, 4 SPEED LIMIT, 5 RED LIGHT

// Hazard hinders player, remedy card needed to resume normal play.

// TODO: try to tie in the remedy cards when played to flip from true to false
// use hazard as -1 to -5 as 'id' remedy can change 'id' to 1 - 5 =0 in effect/cancel

import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Hazard;


import java.util.ArrayList;
import java.util.List;


public class HazardDeck extends Deck {


    private static List<Card> hazardDeck=new ArrayList<>();

    public HazardDeck(Card card) {
        super(card);
    }

    public static List<Card> buildHazardDeck(Boolean cardPosition) {

        for(int crd=0; crd<3; crd++){
            hazardDeck.add(new Hazard(false,"STOP"));
            hazardDeck.add(new Hazard(false,"FLAT TIRE"));
            hazardDeck.add(new Hazard(false,"ACCIDENT"));
        }

        for(int crd=0; crd<4; crd++){
            hazardDeck.add(new Hazard(false,"SPEED LIMIT"));
            hazardDeck.add(new Hazard(false,"RED LIGHT"));
        }

        hazardDeck.add(new Hazard(false,"RED LIGHT"));

        return hazardDeck;
    }


}
