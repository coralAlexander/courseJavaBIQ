package exercise_cardDeck;

public class DeckMain {

	public static void main(String[] args) {
		Deck deck = new Deck();
        deck.shafelDeck();
        Card card = deck.deal();
        Card card1 = deck.deal();
        Card card3 = deck.deal();
        System.out.println("First card : "+card  +  "Second card" + card1 + "Third card" + card3 );
        deck.putBack(card3);
	}

}
