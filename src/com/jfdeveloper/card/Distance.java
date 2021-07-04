package com.jfdeveloper.card;

public class Distance extends Card{

//    enum DistanceCard{TWENTYFIVE("25m"),FIFTY("50m");
//
//        String cardValue;
//
//        DistanceCard(String cardValue) {
//            this.cardValue=cardValue;
//        }
//
//        public String getDistanceCard(){
//            return this.cardValue;
//        }
//    }

    private int distance;

    public Distance(Boolean faceUpDown, String cardFace, int cardId, int distance) {
        super(faceUpDown, cardFace, cardId);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }


    public String toString() {
        return "Distance { " +
                "distance:" + distance +

                '}';
    }
}
