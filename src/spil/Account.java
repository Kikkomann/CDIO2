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
		if(balance < reward)
		{
			return false;
		}
			
		else
		balance += reward;
		
		return true;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public String toString(){
		return "" + balance;
	}
}
