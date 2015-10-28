package spil;

public class DiceCup {
	
	private Dice[] dices;

	public DiceCup() {
		dices = new Dice[2];
		dices[0] = new Dice();
		dices[1] = new Dice();
	}
	
	public void roll(){
		dices[0].roll();
		dices[1].roll();
		return;
	}
	
	public int[] getDiceValues(){
		return new int[] { dices[0].getValue(), dices[1].getValue() };
	}
	
	public int getDiceSum(){
		return dices[0].getValue() + dices[1].getValue();
	}

	public String toString() {
		return "" + getDiceSum();
	}
	
	
	
	

}
