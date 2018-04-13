import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author chad clauson, renlei huang, nipa das
 * @
 */

public class Table {
	
	public static void menu() {
		boolean ready = false;

		while(!ready) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to Crazy Eights! (2-Player + Computer Version)");
			System.out.println("Please make a selection :");
			System.out.println("1: Rules");
			System.out.println("2: Play");
			System.out.println("3: Quit");
			System.out.print("> ");
			
			int input = scan.nextInt();
			
			switch (input) {
				case 1 : System.out.println("Crazy Eights is a game for two players in which the goal is to get rid of your cards " +
						                     "in your hand onto the discard pile by matching the number\nor the suit of the card on top of the discard"
						                     + " pile. Each player starts with seven cards and alternates turns. The remaining deck of cards "
						                     + "is placed\nfaced down and the top card will be flipped over to start the discard pile. "
						                     + "If you do not have a card that matches, you must continue drawing a card\nuntil one is playable."
						                     + " A player may be able to place down an 8 on any card of the discard pile. That person then declares"
						                     + " a suit. The other player\nmust then place down an 8 or the suit declared. A player wins by emptying"
						                     + " their hand.\n ");
						 break;
						 
				case 2 : System.out.println("Have fun!");
				         ready = true;
				         System.out.println();
				         break;
				         
				case 3 : System.out.println("Goodbye!");
				         System.exit(0);
				         
				default : System.out.println("Goodbye!");
		         		  System.exit(0);          
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
		Player player1 = new Player("Georgia");
		ArrayList<Card> p1Hand = player1.getHand();
		Player player2 = new Player("Florida");
		Player computer = new Player("Computer");
		Deck deck = new Deck();
		ArrayList<Card> playPile = new ArrayList<Card>();
			
		for(int i = 0; i < 5; i++) {
			player1.add(deck.gimmeACard());
			player2.add(deck.gimmeACard());
			computer.add(deck.gimmeACard());
		}
		
		// First turn 
		System.out.println("It is " + player1.getName() + "'s turn. Please play a card by typing the position # in your hand > ");
		boolean endTurn = false;
		player1.printHandInfo();
		
		while(!endTurn) {
			Scanner scan = new Scanner(System.in);
			int cardSelect = scan.nextInt();
			if((0 < cardSelect) && (cardSelect <= p1Hand.size())) {
				playPile.add(p1Hand.get(cardSelect - 1));
				System.out.print("You played ");
				p1Hand.get(cardSelect - 1).printInfo(); 
				p1Hand.remove(cardSelect - 1);
				// possibly add score???
				if(p1Hand.isEmpty() == true) {
					System.out.println("Georgia wins!");
					System.exit(0);
				}
				endTurn = true;
			}
			else {
				System.out.println("You have selected an invalid hand position. Please select a valid position >");
			}
		}
		

	}

}
