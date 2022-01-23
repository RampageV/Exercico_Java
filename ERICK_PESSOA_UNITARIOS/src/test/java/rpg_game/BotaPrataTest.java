package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaPrataTest {

	@Test
	public void ForcaAgilidade() {
		BotaPrata botaPrata = new BotaPrata();
		
		assertEquals(2, botaPrata.getForca());
		assertEquals(1, botaPrata.getAgilidade());
	}
	
	@Test
	public void InteligenciaNomeBota() {
		BotaPrata botaPrata = new BotaPrata();
		
		assertEquals(1, botaPrata.getInteligencia());
		assertEquals("Bota prata", botaPrata.getNomeBota());
	}

}
