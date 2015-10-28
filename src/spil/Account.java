package spil;

public class Account {

	private int balance;
	
	public Account(){
		balance = 1000;
	}
	
	public boolean deposit(int value){
		balance += value;
		return true;
	}
	
	public boolean withdraw(int value){
		if(balance < value)
		{
			balance = 0;
		}
			
		else
		balance -= value;
		
		return true;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public String toString(){
		return "" + balance;
	}
}
