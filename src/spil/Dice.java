package spil;

public class Dice {

	private int value;
	private int diceSize = 6;
	
	public Dice()
	{
		value = (int) (Math.random() * diceSize) + 1;
	}
	
	public int roll()
	{
		value = (int) (Math.random() * diceSize) + 1;
		return value;
	}
	
	public int getValue()
	{
		return value;
	}

	public String toString() 
	{
		return "" + getValue();
	}
	
	
	
}
