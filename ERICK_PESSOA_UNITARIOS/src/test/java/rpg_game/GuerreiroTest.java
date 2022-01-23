package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuerreiroTest {

	@Test
	public void testAtributos() {

		Guerreiro guerreiro = new Guerreiro("Erick");
		assertEquals(10, guerreiro.getForca());
		assertEquals(5, guerreiro.getAgilidade());
		assertEquals(2, guerreiro.getInteligencia());
		assertEquals(300, guerreiro.getHp());
		assertEquals("Guerreiro", guerreiro.getFuncao());
		assertEquals("Erick", guerreiro.getNome());

	}

	@Test
	public void testLvlUp() {

		Guerreiro guerreiro = new Guerreiro("Pedro");
		guerreiro.lvlUp();

		assertEquals(2, guerreiro.getLevel());
		assertEquals(13, guerreiro.getForca());
		assertEquals(6, guerreiro.getAgilidade());
		assertEquals(3, guerreiro.getInteligencia());
	}

	@Test
	public void testAtaque() {

		Guerreiro guerreiro = new Guerreiro("João");
		guerreiro.ataque();

		assertEquals(10, guerreiro.getForca());

	}

	@Test
	public void testAtaque2() {

		Guerreiro guerreiro = new Guerreiro("Ricardo");
		guerreiro.ataque2();

		assertEquals(10, guerreiro.getForca());

	}

}
