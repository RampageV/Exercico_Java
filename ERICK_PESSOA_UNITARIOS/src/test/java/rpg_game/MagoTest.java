package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagoTest {

	@Test
	public void testAtributos() {
		Mago mago = new Mago("Lucas");
		mago.setAgilidade(1);
		mago.setForca(1);
		mago.setFuncao("Arqueiro");
		mago.setHp(100);
		mago.setInteligencia(1);
		mago.setMana(100);

		assertEquals(1, mago.getAgilidade());
		assertEquals(1, mago.getInteligencia());
		assertEquals(1, mago.getForca());
		assertEquals("Arqueiro", mago.getFuncao());
		assertEquals(100, mago.getHp());
		assertEquals(100, mago.getMana());

	}

	@Test
	public void testUp() {
		Mago mago = new Mago("Lucas");
		
		mago.lvlUp();
		
		assertEquals(6, mago.getAgilidade());
		assertEquals(13, mago.getInteligencia());
		assertEquals(3, mago.getForca());
		assertEquals("Mago", mago.getFuncao());
		assertEquals(150, mago.getHp());
		assertEquals(1300, mago.getMana());

	}

	@Test
	public void testAtque() {
		Mago mago = new Mago("Lucas");
		mago.ataque();

		assertEquals(2, mago.getForca());
	}

	@Test
	public void testAtque2() {
		Mago mago = new Mago("Lucas");
		mago.ataque2();

		assertEquals(2, mago.getForca());

	}

}
