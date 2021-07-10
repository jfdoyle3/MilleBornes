package com.jfdeveloper.card;

public class Distance extends Card {

    private final int distance;


    public Distance(boolean faceUpDown, String cardFace, int distance) {
        super(faceUpDown, cardFace);
        this.distance = distance;

    }

    public int getDistance() {
        return distance;
    }


    @Override
    public String toString() {
        return "Distance{" +
                "cardFace='" + cardFace + '\'' +
                ", distance=" + distance +
                '}';
    }
}
