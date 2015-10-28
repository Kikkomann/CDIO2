package spil;

public class DiceCup {
	
	Dice[] dices;

	public DiceCup() {
		dices = new Dice[2];
		dices[0] = new Dice();
		dices[1] = new Dice();
	}
	
	public int[] roll(){
		return new int[] {dices[0].roll(), dices[1].roll()};
	}
	
	public int getDiceSum(){
		return dices[0].getValue() + dices[1].getValue();
	}

	public String toString() {
		return "" + getDiceSum();
	}
	
	
	
	

}
