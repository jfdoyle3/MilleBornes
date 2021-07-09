package com.jfdeveloper.card;

public class Distance extends Card {

    private final int distance;


    public Distance(Boolean faceUpDown, String cardFace, int cardId, int distance) {
        super(faceUpDown, cardFace, cardId);
        this.distance = distance;
        this.cardId = cardId;
    }

    public int getDistance() {
        return distance;
    }


    @Override
    public String toString() {
        return "Distance{ cardId: " + cardId +
                ", distance: " + distance +
                " }";
    }
}
