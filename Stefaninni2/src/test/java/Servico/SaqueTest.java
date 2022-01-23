package Servico;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Test;
import org.mockito.Mockito;

import Entidade.Conta;
import Entidade.Usuario;
import Util.APIConnection;
import Util.DataBaseConnection;

public class SaqueTest {

	@Test
	public void testRealizarSaque() {

		APIConnection consultaSPCMock = Mockito.mock(APIConnection.class);
		DataBaseConnection insertContaMock = Mockito.mock(DataBaseConnection.class);

		Usuario erick = new Usuario("Erick");
		Conta contaErick = new Conta();
	
		contaErick.setUsuario(erick);
		contaErick.setAgencia("55666");
		contaErick.setSaldo(500.00);

		Saque saqueErick = new Saque();

		saqueErick.setApiconnection(consultaSPCMock);
		saqueErick.setBdconnection(insertContaMock);

		Mockito.when(consultaSPCMock.consultaSPC(contaErick.getUsuario().getNome())).thenReturn(true);

		saqueErick.realizarSaque(contaErick, 100.00);

		assertEquals(400.00, contaErick.getSaldo(), 0.01); // Esse 0.01 é as casas decimas
		
		Mockito.verify(insertContaMock).insertConta(contaErick); // Verifica o método insertConta
	}

	@Test
	public void testRealizarSaqueSaldoInsuficiente() {

		APIConnection consultaSPCMock = Mockito.mock(APIConnection.class);
		DataBaseConnection insertContaMock = Mockito.mock(DataBaseConnection.class);

		// Montagem
		Usuario erick = new Usuario("Erick");
		Conta contaErick = new Conta();
		contaErick.setUsuario(erick);
		contaErick.setAgencia("55666");
		contaErick.setSaldo(500.00);

		Saque saqueErick = new Saque();

		saqueErick.setApiconnection(consultaSPCMock);
		saqueErick.setBdconnection(insertContaMock);

		Mockito.when(consultaSPCMock.consultaSPC(contaErick.getUsuario().getNome())).thenReturn(true);
		// AÇÃO
		saqueErick.realizarSaque(contaErick, 1000.00);

		// Teste
		assertEquals(500.00, contaErick.getSaldo(), 0.01); // Esse 0.01 é as casas decimas
	}
}
