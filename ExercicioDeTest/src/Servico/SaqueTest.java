package Servico;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import Entidade.Conta;
import Entidade.Usuario;

public class SaqueTest {

	@Test
	public void testRealizarSaque() {

		Usuario erick = new Usuario("Erick");
		Conta contaErick = new Conta();

		contaErick.setUsuario(erick);
		contaErick.setAgencia("55666");
		contaErick.setSaldo(500.00);

		Saque saqueErick = new Saque();

		saqueErick.realizarSaque(contaErick,100.00);
		
		assertEquals(400.00,contaErick.getSaldo(),0.01); // Esse 0.01 é as casas decimas
	}

	@Test
	public void testRealizarSaqueSaldoInsuficiente() {

		// Montagem
		Usuario erick = new Usuario("Erick");
		Conta contaErick = new Conta();
		contaErick.setUsuario(erick);
		contaErick.setAgencia("55666");
		contaErick.setSaldo(500.00);

		Saque saqueErick = new Saque();

		//AÇÃO
		saqueErick.realizarSaque(contaErick,1000.00);
		
		// Teste 
		assertEquals(500.00,contaErick.getSaldo(),0.01); // Esse 0.01 é as casas decimas
	}
}
