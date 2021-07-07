package com.jfdeveloper.card;

public enum DistanceCard {

   // TWENTYFIVE("10M"),
   // FIFTY("50M"),
	D25 ("25 Miles", "25.png", "|25|"),
    D50 ("50 Miles", "50.png", "|50|");

    private String cardFace;
    private String picture;
    private String distance;


    DistanceCard(String cardFace, String picture, String distance) {
        this.cardFace = cardFace;
        this.picture = picture;
        this.distance = distance;
    }

    public String getCardFace() {
        return cardFace;
    }

    public String getPicture() {
        return picture;
    }

    public String getDistance() {
        return distance;
    }
}





