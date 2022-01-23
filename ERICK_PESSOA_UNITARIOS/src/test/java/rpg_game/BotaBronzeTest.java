package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaBronzeTest {

	@Test
	public void TestNomeForca (){
		
		BotaBronze botaBronze = new BotaBronze();
		assertEquals("Bota bronze", botaBronze.getNomeBota());
		assertEquals(1, botaBronze.getForca());
	}

}
