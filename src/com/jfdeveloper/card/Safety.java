package com.jfdeveloper.card;

// Safety Card: EMERGENCY VEHICLE, FUEL TRUCK, PUNCTURE PROOF, DRIVING ACE
//Safeties:  1 EXTRA TANK, 1 PUNCTURE PROOF, 1 DRIVING ACE, 1 RIGHT OF WAY

// how do i add these cards to play?
// cards when played to flip from true to false?

public class Safety extends Card{


    public Safety(String cardFace) {
        super(cardFace);
    }


    @Override
    public String toString() {
        return "Safety{" +
                "faceUpDown=" + faceUpDown +
                ", cardFace='" + cardFace + '\'' +
                '}';
    }
}
