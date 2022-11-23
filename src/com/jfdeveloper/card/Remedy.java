package com.jfdeveloper.card;

// Remedy CARDS: DRIVE, END OF SPEED LIMIT, GAS, SPARE TIRE, REPAIRS
// Hazard Cards: STOP, SPEED LIMIT(<=50m), OUT OF GAS, FLAT TIRE, ACCIDENT
// Remedies:  6 GASOLINE, 6 SPARE TIRE, 6 REPAIRS, 6 END OF SPEED LIMIT, 14 ROLL

// Remedy cancels hazard cards, resume play.

// TODO: try to tie in the hazard cards when played to flip from true to false

public class Remedy extends Card {
    public Remedy(String cardFace) {
        super(cardFace);
    }


    @Override
    public String toString() {
        return "Remedy{" +
                "faceUpDown=" + faceUpDown +
                ", cardFace='" + cardFace + '\'' +
                '}';
    }
}
