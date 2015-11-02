package spil;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

public class TestGame {

	@Test
	public void testDiceRolls() {
		DiceCup dc = new DiceCup();
		int sum;
		int[] rolls = new int[11];
		double[] pct = new double[11];
		for(int i = 0; i < 1000; i++)
		{
			dc.roll();
			
			for(int j = 0; j < rolls.length; j++)
				rolls[dc.getDiceSum() - 2]++;
		}
		sum = IntStream.of(rolls).sum();
		for(int i = 0; i < pct.length; i++)
			pct[i] = ((double) rolls[i]/sum) * 100;

		
		for(int count : rolls)
			System.out.println(count);
		sum = IntStream.of(rolls).sum();
		System.out.println("\n\n" + sum + "\n\n");
		for(double count : pct)
			System.out.println(count);
		
	}
	
	@Test
	public void testStartWith1000() {
		Player p = new Player("name");
		assertEquals(1000, p.getBalance());
	}
	
//	@Test
//	public void testCheckWinner() {
//		Game game = new Game();
//		Player[] player = new Player[2];
//		player[0] = new Player("p1");
//		player[1] = new Player("p2");
//		
//		player[0].changeBalance(2000);
//		assertEquals(true, game.checkWinner());
//	}
	
	@Test
	public void testBelow0() {
		Player p = new Player("p1");
		p.changeBalance(-1001);
		assertEquals(0, p.getBalance());		
	}
//	
//	@Test
//	public void testGame() {
//		Game game = new Game();
//		
//	}

}
