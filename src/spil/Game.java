package spil;

import desktop_resources.GUI;

public class Game {

	private static Player[] player;
	private static DiceCup dicecup;
	private static Field[] field;
	
	public Game(){
		field = new Field[11];
		field[0] = new Field("Tower", "You find a tower and at the top of the tower's stairs someone forgot his wallet. Wow is not bad!", 250, false);
		field[1] = new Field("Crater", "As you walk in the forest you are not paying attention to the path and fall into a crater. You can't get up yourself and after two hours of crying for help, someone finds you and helps you up. He charge you 100 for the help", -100, false);
		field[2] = new Field("Palace Gates", "You reach the Palace Gates and say hello to your cousin who owes you 100.", 100, false);
		field[3] = new Field("Cold Deserts", "You want to see the Cold Deserts, but forgot a warm hat. Luckily a new one only costs 20.", -20, false);
		field[4] = new Field("Walled City", "You go to Walled City, the city of gambling. You stick around for some hours and end up richer than when you came. During your time there, you managed to win 180.", 180, false);
		field[5] = new Field("Monastery", "On your journey you come across a monastery. Monks are boring, so you walk past and hope for something more interesting next time.", 0, false);
		field[6] = new Field("Black Cave", "You come to the end of the forest path and find a black cave. You are getting hungry and buy a sandwich at the Sandwich Man before you explore the cave. It is a delicious sandwich and it only costed you 70.", -70, false);
		field[7] = new Field("Huts in the Mountains", "You decided to go to the mountains and discover some huts. People like you so much that they want to give you a present. It is an ugly statue that you sell for 60.", 60, false);
		field[8] = new Field("The Werewall", "You don't realize that you have come to the dangerous area in the kingdom - the Werewall. The werewolfes spot you and tries to catch you. You try to pay you out of the situation, but apparently 80 is not enough to help you. You run as fast as you can, and moves on quickly. You better roll again.", -80, true);
		field[9] = new Field("The Pit", "It is getting late and the only place that is open now is The Pit. Tonights theme adventure-party. Entrance is 50 and you go in and party all night.", -50, false);
		field[10] = new Field("Goldmine", "You spot a goldmine full of gold. You take as much as you can and sell it all for 650.", 650, false);
		
		dicecup = new DiceCup();
		player = new Player[2];
		player[0] = new Player(GUI.getUserString("Choose a name for player 1:"));
		player[1] = new Player(GUI.getUserString("Choose a name for player 2:"));
		GUI.addPlayer(player[0].getName(), player[0].getBalance());
		GUI.addPlayer(player[1].getName(), player[1].getBalance());
	}
	
	private void run(){
		int turn = 0;
		Player cplayer = player[turn]; //current player
		Field cfield = field[(dicecup.getDiceSum()) - 2];
		
		while(!checkWinner())
		{
			GUI.getUserButtonPressed(cplayer.getName() + ", your turn.", "Roll");
			dicecup.roll();
			cfield = field[(dicecup.getDiceSum()) - 2];
			GUI.setDice((dicecup.getDiceValues())[0], (dicecup.getDiceValues())[1]);
			
			GUI.showMessage(cfield.getDescription());
			cfield.land(cplayer);
			
				
			
			System.out.println(cplayer.getBalance());
			System.out.println(cfield.toString());
			
			turn = (cfield.getExtraTurn()) ? 0 : 1;
				
			
			
		}
	}
	
	
	
	private boolean checkWinner(){
		if(player[0].getBalance() >= 3000 || player[0].getBalance() >= 3000)
			return true;
		
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Game game = new Game();
		
		game.run();

	}
	
}
