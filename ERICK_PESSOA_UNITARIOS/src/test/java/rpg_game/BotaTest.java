package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaTest {

	@Test
	public void TestGetSet() {
		Bota bota = new Bota();

		bota.setAgilidade(1);
		bota.setForca(1);
		bota.setInteligencia(1);
		bota.setNomeBota("Adidas");

		assertEquals(1, bota.getForca());
		assertEquals(1, bota.getAgilidade());
		assertEquals(1, bota.getInteligencia());
		assertEquals("Adidas", bota.getNomeBota());

	}

}
