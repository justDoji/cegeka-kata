package com.cegeka.red7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DeckTest {

  @Test
  public void givenInitialState_deckContainsNoDuplicates() {
    Deck deck = new Deck();
    List<Card> cardsInDeck = deck.getCardsInDeck();
    Set<Card> uniqueCards = new HashSet<>();
    uniqueCards.addAll(cardsInDeck);

    Assertions.assertThat(uniqueCards).containsAll(cardsInDeck);
  }

  @Test
  public void givenInitialState_whenTakingCard_deckNoLongerContainsCard() {
    Deck deck = new Deck();
    List<Card> cardsInDeckInitial = deck.getCardsInDeck();

    Card drawnCard = deck.drawCard();

    List<Card> cardsRemianingInDeck = deck.getCardsInDeck();

    Assertions.assertThat(cardsRemianingInDeck).doesNotContain(drawnCard);
    Assertions.assertThat(cardsRemianingInDeck.size()).isEqualTo(cardsInDeckInitial.size() -1);
  }

}