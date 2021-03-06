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
	
	public String getDescription(){
		return description;
	}
	
	public boolean land(Player player){
		player.changeBalance(reward);
		return extraTurn;
	}
	
	public String toString(){
		return name + " gives " + reward + " points.";
	}
	
	
}
