package spil;

public class Field {

	private String name, description;
	private int reward;
	private boolean extraTurn;
	
	public Field(String name, String description, int reward, boolean extraTurn) {
		super();
		this.name = name;
		this.description = description;
		this.reward = reward;
		this.extraTurn = extraTurn;
	}
	
	public void land(Player player){
		player.changeBalance(reward);
		
	}
	
	public String toString(){
		return name + " gives " + reward + " points.";
	}
	
	
}
