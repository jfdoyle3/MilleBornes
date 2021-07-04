package com.jfdeveloper.card;

public enum DistanceCard {

    TWENTYFIVE("10M"),
    FIFTY("50M");

    private String cardValue;


    DistanceCard(String cardValue) {
        this.cardValue = cardValue;
    }

    public String getDistanceCard() {
        return this.cardValue;
    }

}





