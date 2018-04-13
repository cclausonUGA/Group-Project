import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	ArrayList<Card> deck = new ArrayList<Card>(52);
	
	public Deck()
	{
		generateDeck();
	}
	
	public Card gimmeACard()
	{
		Random rand = new Random();
		int position = rand.nextInt(deck.size());
		Card aCard = deck.get(position);
		deck.remove(position);
		return aCard;
	}
	
	private void generateDeck()
	{
		
		String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
		String[] faces = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		int[] faceValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};

		
		for(int i = 0; i < suits.length;i++)
		{
			for(int j = 0; j < faces.length; j++)
			{
				Card aCard = new Card(suits[i],faces[j], faceValues[j]);
				deck.add(aCard);
			}
		}
	}
	
	/**
	 * printDeckSize() prints amount of remaining cards left in deck
	 */
	public void printDeckSize() {
		
		System.out.println(deck.size());
	}
}
