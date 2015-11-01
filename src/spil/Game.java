package spil;

import desktop_resources.GUI;

public class Game {

	private static Player[] player;
	private static DiceCup dicecup;
	private static Field[] field;
	
	public Game(){
		field = new Field[11];
		field[0] = new Field("Tower", "", 250, false);
		field[1] = new Field("Crater", "", -100, false);
		field[2] = new Field("Palace Gates", "", 100, false);
		field[3] = new Field("Cold Deserts", "", -20, false);
		field[4] = new Field("Walled City", "", 180, false);
		field[5] = new Field("Monastery", "", 0, false);
		field[6] = new Field("Black Cave", "", -70, false);
		field[7] = new Field("Huts in the Mountains", "", 60, false);
		field[8] = new Field("The Werewall", "", -80, true);
		field[9] = new Field("The Pit", "", -50, false);
		field[10] = new Field("Goldmine", "", 650, false);
		
		dicecup = new DiceCup();
		player = new Player[2];
		player[0] = new Player("p1");
		player[1] = new Player("p2");
	}
	
	private void run(){
		
		
		
	}
	
	
}
