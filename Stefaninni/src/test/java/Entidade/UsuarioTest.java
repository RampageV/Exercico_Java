package Entidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void UsuarioInstanciado() {
		Usuario entrada = new Usuario();
	}

	@Test
	public void InstanciaUsuarioStirng() {
		Usuario entrada = new Usuario("Erick");
	}

	@Test
	public void InstanciaUsuarioGetSet() {
		Usuario entrada = new Usuario();
		entrada.setNome("Erick");
		assertEquals("Erick", entrada.getNome()); // Test para ver se é igual.
	}

	@Test
	public void assertivasTest() {
		assertTrue(true);
		assertFalse(false);
		Usuario entrada = new Usuario("Erick");
		Usuario entrada2 = entrada;
		Usuario entrada3 = new Usuario("Erick");
		assertSame(entrada, entrada2); // Compara se os objetos são iguais.
		assertNotSame(entrada3, entrada); // Verifica se os objetos são diferente, se for ele da true
		assertNotEquals("Erick", "Levi"); // Se for diferente de igual é true
	}
}
