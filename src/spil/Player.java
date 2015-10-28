package spil;

public class Player {

	private String name;
	private Account account;
	
	public Player(String name){
		this.name = name;
		account = new Account();
	}
	
	public String getName(){
		return name;
	}

	public int getBalance() {
		return account.getBalance();
	}

	public boolean changeBalance() {
		
		return true;
	}

	public String toString() {
		return name + "\n" + account.getBalance() + " points.";
	}
	
	
	
}
