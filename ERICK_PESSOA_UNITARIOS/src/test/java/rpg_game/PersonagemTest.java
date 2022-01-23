package rpg_game;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static rpg_game.Arqueiro.*; 

import org.junit.Test;

public class PersonagemTest {

	@Test
	public void InformarçãoPersonagem() {
	
		Personagem personagem = new Personagem();
		Bota bota  = new Bota();
		
		personagem.setAgilidade(10);
		personagem.setForca(10);
		personagem.setFuncao("Arqueiro");
		personagem.setHp(10);
		personagem.setInteligencia(10);
		personagem.setLevel(1);
		personagem.setMana(10);
		personagem.setNome("Erick");
		
		assertEquals(10, personagem.getAgilidade());
		assertEquals(10, personagem.getForca());
		assertEquals("Arqueiro", personagem.getFuncao());
		assertEquals(10, personagem.getHp());
		assertEquals(10, personagem.getInteligencia());
		assertEquals(1, personagem.getLevel());
		assertEquals(1000, personagem.getMana());
		assertEquals("Erick", personagem.getNome());
		
		personagem.exibirDadosInicialJogador();
		
		personagem.setAgilidade(50);
		personagem.setForca(50);
		personagem.setFuncao("Arqueiro");
		personagem.setHp(50);
		personagem.setInteligencia(10);
		personagem.setLevel(5);
		personagem.setMana(50);
		personagem.setNome("Erick");
		bota.setAgilidade(10);
		bota.setForca(10);
		bota.setInteligencia(10);
		bota.setAgilidade(10);
		bota.setNomeBota("Fenix");
		personagem.EquiparBota(bota);
		
		assertEquals(70, personagem.getAgilidade());
		assertEquals(80, personagem.getForca());
		assertEquals("Arqueiro", personagem.getFuncao());
		assertEquals(50, personagem.getHp());
		assertEquals(30, personagem.getInteligencia());
		assertEquals(5, personagem.getLevel());
		assertEquals(3000, personagem.getMana());
		assertEquals("Erick", personagem.getNome());
		assertEquals("Fenix", bota.getNomeBota());
		
		personagem.exibirNovosDadosJogador();
		
		
		
	}

}
