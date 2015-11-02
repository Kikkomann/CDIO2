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
				switch(dc.getDiceSum() - 2){
				case 0: rolls[0]++;
						break;
				case 1: rolls[1]++;
						break;
				case 2: rolls[2]++;
						break;
				case 3: rolls[3]++;
						break;
				case 4: rolls[4]++;
						break;
				case 5: rolls[5]++;
						break;
				case 6: rolls[6]++;
						break;
				case 7: rolls[7]++;
						break;
				case 8: rolls[8]++;
						break;
				case 9: rolls[9]++;
						break;
				case 10: rolls[10]++;
						break;
				}
				
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
	
	@Test
	public void testCheckWinner() {
		Game game = new Game();
		Player[] player = new Player[2];
		player[0] = new Player("p1");
		player[1] = new Player("p2");
		
		player[0].changeBalance(2000);
		assertEquals(true, game.checkWinner());
	}
//	
//	@Test
//	public void testGame() {
//		Game game = new Game();
//		
//	}
//	
//	@Test
//	public void testGame() {
//		Game game = new Game();
//		
//	}

}
