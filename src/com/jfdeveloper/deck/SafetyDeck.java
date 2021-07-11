package com.jfdeveloper.deck;
// Safety Card: EMERGENCY VEHICLE, FUEL TRUCK, PUNCTURE PROOF, DRIVING ACE
//Safeties:  1 EXTRA TANK, 1 PUNCTURE PROOF, 1 DRIVING ACE, 1 RIGHT OF WAY

// how do i add these cards to play?
// cards when played to flip from true to false?
import com.jfdeveloper.card.Card;
import com.jfdeveloper.card.Safety;

import java.util.ArrayList;
import java.util.List;

public class SafetyDeck extends Deck {

    private static List<Card> safetyDeck= new ArrayList<>();

    public SafetyDeck(Card card) {
        super(card);
    }

    public static List<Card> buildSafetyDeck(boolean faceUpDown){
        safetyDeck.add(new Safety(faceUpDown,"[EMERGENCY VEHICLE]"));
        safetyDeck.add(new Safety(faceUpDown,"[EXTRA TANK]"));
        safetyDeck.add(new Safety(faceUpDown,"[PUNCTURE PROOF]"));
        safetyDeck.add(new Safety(faceUpDown,"[DRIVING ACE]"));
        safetyDeck.add(new Safety(faceUpDown,"[RIGHT OF WAY]"));

        return safetyDeck;
    }


}
