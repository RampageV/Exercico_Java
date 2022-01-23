package Entidade;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContaTest {

	Conta contatest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*
		 * Usado apenas uma vez no inicio da classe, serve para iniciar algo bem
		 * especifico como a conexão ao banco de dado.
		 */
		System.out.println("No inicio da classe");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("No final da classe");
	}

	@Before
	public void setUp() throws Exception { // Método serve para não repetir codigo/ Ele inicia antes do teste
		contatest = new Conta();
		System.out.println("Inicio");

	}

	@After
	public void tearDown() throws Exception {// RODA NO FINAL DO TEST
		System.out.println("Final");
	}

	@Test
	public void testGetSetAgencia() {
		System.out.println("Teste da Agencia iniciado");
		contatest.setAgencia("123456");
		assertEquals("123456", contatest.getAgencia());
	}

	@Test
	public void testGetSetConta() {
		System.out.println("Teste da Conta iniciado");
		contatest.setConta("1111");
		assertEquals("1111", contatest.getConta());
	}

	@Test
	public void testGetSetUsuario() {
		Usuario entrada = new Usuario("Erick");
		contatest.setUsuario(entrada);
		assertEquals(entrada,contatest.getUsuario());

	}
	
	@Test
	public void testGetSetDataAbertura() {
		Date dataAberta = new Date(2022, 1, 11);
		contatest.setDataAbertura(dataAberta);
		assertEquals(dataAberta,contatest.getDataAbertura());
	}
	
	@Test
	public void testGetSetDataEncerramento() {
		Date dataEncerramento = new Date(2050, 1, 20);
		contatest.setDataEncerramento(dataEncerramento);
		assertEquals(dataEncerramento,contatest.getDataEncerramento());
	}
	@Test
	public void testConstruto() {
	Usuario entrada = new Usuario("Erick");
	contatest = new Conta(entrada,"1111", "505050", 500.00,new Date(2050,1,2));
	assertEquals(entrada, contatest.getUsuario());
	assertEquals("1111",contatest.getAgencia());
	assertEquals("505050",contatest.getConta());
	assertEquals(500.00,contatest.getSaldo(),0.01);
	assertEquals(new Date(2050,1,2), contatest.getDataAbertura());
	
	}

}
