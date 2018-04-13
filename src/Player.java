import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int score; // may use to shorten game length
	
	
	public Player(String name) {
		this.name = name;
		
		
	}
	
	/**
	 * gets current player's name
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * gets current player's hand size
	 * @return
	 */
	
	public int handSize() {
		return hand.size();
	}

	
	/**
	 * gets current player's hand
	 * @return
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}
	
//	public void playCard(int cardSelect) {
//		hand.remove(cardSelect + 1);
//		
//	}
	
	/**
	 * 	adds card to hand
	 */
	
	public void add(Card aCard)
	{
		hand.add(aCard);
	}
	
	/**
	 * printHandInfo() displays selected player's hand
	 * CURRENTLY USED TO TEST HAND AND UNIQUE CARDS CORRECTLY (2 PLAYERS CANT HAVE SAME CARD)
	 * UPDATE: APPEARS TO BE WORKING
	 */
	
	public void printHandInfo() {
		for(int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i).getFace() + " of " + hand.get(i).getSuit());
		}
	}
	
	
}
