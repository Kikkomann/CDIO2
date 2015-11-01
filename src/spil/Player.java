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

	public boolean changeBalance(int balance) {
		if (balance < 0)
		{
			if(account.getBalance() < balance)
				return false;
				
			else
			{
				account.withdraw(balance);
				return true;
			}
		}
		else
		{
			account.deposit(balance);
			return true;
		}
	}

	public String toString() {
		return name + "\n" + account.getBalance() + " points.";
	}
	
	
	
}
