package com.jfdeveloper.card;

public class Card {

    private boolean faceUpDown;
    private String cardFace;
    private int cardId;

    public Card(Boolean faceUpDown, String cardFace, int cardId) {
        this.faceUpDown = faceUpDown;
        this.cardFace = cardFace;
        this.cardId = cardId;
    }

    public void flip() {
        faceUpDown = !faceUpDown;
    }

    public String getCardFace() {
        if(this.faceUpDown)
            return this.cardFace;
        return "[#]";
    }

    public int getCardId() {
        return cardId;
    }

    @Override
    public String toString() {
        return "Card{ faceUpDown: " + faceUpDown +", cardFace: '" + cardFace + "', cardId: " + cardId +" }";
    }
}
