package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static rpg_game.Bota.*;

public class CombateTest {

	@Test
	public void testCombate() {

		
		Bota bota1 = new Bota();
		Personagem personagem1 = new Personagem();
		Personagem personagem2 = new Personagem();
		Combate combate = new Combate();

		// personagem 1
		
		
		bota1.setAgilidade(5);
		bota1.setForca(5);
		bota1.setInteligencia(5);
		bota1.setNomeBota("Adidas");
		
		personagem1.setAgilidade(1);
		personagem1.setForca(1);
		personagem1.setInteligencia(1);
		personagem1.setHp(1);
		personagem1.setLevel(1);
		personagem1.setMana(1);
		personagem1.setFuncao("arqueiro");
		personagem1.setNome("Andre");
		
		assertEquals(1, personagem1.getAgilidade());
		assertEquals(1, personagem1.getForca());
		assertEquals(1, personagem1.getInteligencia());
		assertEquals(1, personagem1.getHp());
		assertEquals(100, personagem1.getMana());
		assertEquals(1, personagem1.getAgilidade());
		assertEquals("arqueiro", personagem1.getFuncao());
		assertEquals("Andre", personagem1.getNome());

		// personagem 2
		personagem2.setAgilidade(5);
		personagem2.setForca(5);
		personagem2.setInteligencia(5);
		personagem2.setHp(5);
		personagem2.setLevel(5);
		personagem2.setMana(5);
		personagem2.setFuncao("Querreiro");
		personagem2.setNome("Erick");
		personagem2.EquiparBota(bota1);

		assertEquals(15, personagem2.getAgilidade());
		assertEquals(20, personagem2.getForca());
		assertEquals(15, personagem2.getInteligencia());
		assertEquals(5, personagem2.getHp());
		assertEquals(1500, personagem2.getMana());
		assertEquals(15, personagem2.getAgilidade());
		assertEquals("Adidas", bota1.getNomeBota());
		assertEquals("Querreiro", personagem2.getFuncao());
		assertEquals("Erick", personagem2.getNome());

		combate.lutaCorporal(personagem1, personagem2);
		combate.embateXadrez(personagem1, personagem2);
		combate.embateXadrez(personagem2, personagem1);
		combate.embateXadrez(personagem2, personagem2);
		
	}

}
