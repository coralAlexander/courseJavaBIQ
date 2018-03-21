package exercise_cardDeck;

import java.util.Random;
public class Deck {
	int randomNumber1 = 0;
	int randomNumber2 = 0;
	int minNum = 0;
	int maxNumber = 51;
	private Card card;
	private Card card1;
	int count = 0 ;
	private Card[] arrayOfCardsDeck = new Card[52];
	private Card[] arrayOfHearts = new Card[12];
	private Card[] arrayOfSpades = new Card[12];
	private Card[] arrayOfDiamonds = new Card[12];
	private Card[] arrayOfClubs = new Card[12];
	private Card[] arrayOfJokers = new Card[4];
	
	public Deck() {
		addSuit(arrayOfHearts,"heart");
		addSuit(arrayOfSpades,"spade");
		addSuit(arrayOfDiamonds,"diamond");
		addSuit(arrayOfClubs,"club");
		addSuit(arrayOfJokers,"joker");
	}	
	private void addSuit(Card [] specificsuit,String suitName) {	
		for (int i = 0; i < specificsuit.length; i++) {
			if(suitName.equals("joker")) {
			specificsuit[i] = card = new Card("joker", 0);
			}
			else {
				specificsuit[i] = card = new Card(suitName, i+1);
			}
		}
		for (Card card : specificsuit) {
			arrayOfCardsDeck[count] = card;
			count++;
		}
	}	
	public void shafelDeck() {
		Random rand = new Random();
		for(int i = 0 ;i< arrayOfCardsDeck.length ;i++) {
			randomNumber1 = rand.nextInt(maxNumber - minNum+1) + minNum;
			randomNumber2 = rand.nextInt(maxNumber - minNum+1) + minNum;
			Card temp1=arrayOfCardsDeck[randomNumber1];
			Card temp2= arrayOfCardsDeck[randomNumber2];
			arrayOfCardsDeck[randomNumber1]=temp2;
			arrayOfCardsDeck[randomNumber2]=temp1;	
		}
	}
	
	public Card deal() {
		boolean ifdeckEmpty=true;
		for (int i = 0; i < arrayOfCardsDeck.length; i++) {
			if(!(arrayOfCardsDeck[i] == null)) {
			    card1 = arrayOfCardsDeck[i];
				ifdeckEmpty = false;
				arrayOfCardsDeck[i]=null;
				break;
			}
			else {
				ifdeckEmpty=true;
				continue;
			}
		}	
		try {
			if (ifdeckEmpty==true) {
				throw new Error("Deck is empty !!!!!!");
			}
			else {	
				card = card1;
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		return card;	
	}
	public void putBack(Card card) {
		for (int i = 0; i < arrayOfCardsDeck.length; i++) {
			if(arrayOfCardsDeck[i] == null) {
				arrayOfCardsDeck[i]=card;
				System.out.println("Card added successefully ");
				break;
			}
			else {
				continue;
			}
		}
	}
}
