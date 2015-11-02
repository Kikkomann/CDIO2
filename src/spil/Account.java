package spil;

public class Account {

	private int balance;
	
	public Account(){
		balance = 1000;
	}
	
	public boolean deposit(int reward){
		balance += reward;
		return true;
	}
	
	public boolean withdraw(int reward){
		if(reward > balance)
		{
			balance = 0;
			return true;
		}
			
		else
		{
			balance += reward;
			return true;
		}
	}
	
	public int getBalance(){
		return balance;
	}
	
	public String toString(){
		return "" + balance;
	}
}
