package com.cegeka.red7;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Player {

    private String name;
    private List<Card> handCards;
    private List<Card> paletteCards;

    public Player(List<Card> handCards, Card startingTableauCard) {
        this(null, handCards, startingTableauCard);
    }

    public Player(String playerName, List<Card> handCards, Card startingPaletteCard) {
        name = playerName;
        this.handCards = handCards;
        this.paletteCards = newArrayList(startingPaletteCard);
    }

    public String getName() {
        return name;
    }

    public List<Card> getHandCards() {
        return handCards;
    }

    public List<Card> getPaletteCards() {
        return paletteCards;
    }
}
