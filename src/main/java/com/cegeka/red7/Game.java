package com.cegeka.red7;

import java.util.List;
import java.util.stream.Collectors;

public class Game {

  private List<Player> players;

  public Game(List<String> playerNames) {
    players = playerNames.stream().map(playerName -> new Player(playerName, dealHandCards(), dealPaletteCard())).collect(
        Collectors.toList());

  }

  private Card dealPaletteCard() {
    return null;
  }

  private List<Card> dealHandCards() {
    return null;
  }

  public List<Player> getPlayers() {
    return players;
  }
}
