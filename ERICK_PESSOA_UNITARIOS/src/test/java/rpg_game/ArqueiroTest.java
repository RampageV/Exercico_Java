package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArqueiroTest {

	@Test
	public void ColocandoNome() {
		Arqueiro arqueiro = new Arqueiro("Erick");
		assertEquals(5, arqueiro.getForca());
		assertEquals(10, arqueiro.getAgilidade());
		assertEquals(5, arqueiro.getInteligencia());
	}

	@Test
	public void lvlUp() {
		Arqueiro arqueiro = new Arqueiro("Erick");
		arqueiro.lvlUp();
		assertEquals(2, arqueiro.getLevel());
	}

	@Test
	public void VerificacaoAtaqueAtaque2() {
		Arqueiro arqueiro = new Arqueiro("Erick");
		arqueiro.lvlUp();
		arqueiro.ataque();
		arqueiro.ataque2();
		assertEquals(6, arqueiro.getForca());
	}

}
