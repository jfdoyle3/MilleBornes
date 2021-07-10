package com.jfdeveloper.card;

// may have to enum these cards
// Hazard Cards: STOP, SPEED LIMIT(<=50m), OUT OF GAS, FLAT TIRE, ACCIDENT
// Remedy CARDS: DRIVE, END OF SPEED LIMIT, GAS, SPARE TIRE, REPAIRS

// Hazard hinders player, remedy card needed to resume normal play.

// TODO: try to tie in the remedy cards when played to flip from true to false
// use hazard as -1 to -5 as 'id' remedy can change 'id' to 1 - 5 =0 in effect/cancel

public class Hazard extends Card {

    private boolean inEffect=false;


    public Hazard(boolean faceUpDown, String cardFace) {
        super(faceUpDown, cardFace);
    }

    public boolean isInEffect() {
        return inEffect;
    }

    public void setInEffect(boolean inEffect) {
        this.inEffect = inEffect;
    }

    @Override
    public String toString() {
        return "Hazard{" +
                "faceUpDown=" + faceUpDown +
                ", cardFace='" + cardFace + '\'' +
                ", inEffect=" + inEffect +
                '}';
    }
}
