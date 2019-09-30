package com.cegeka.red7;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

  private Game game;


  @Before
  public void setUp() throws Exception {
    game = new Game(Arrays.asList("Bob", "Jos", "Bert"));
  }

  @Test
  public void afterInit_gameHasPlayers() {

    List<Player> playersInGame = game.getPlayers();

    Assertions.assertThat(playersInGame).hasSize(3);
  }

  @Test
  public void afterInit_EachPlayerHas7CardsInHand() {

  }
}