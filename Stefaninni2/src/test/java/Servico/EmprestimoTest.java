package Servico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Util.DataUtil;

public class EmprestimoTest {

	Emprestimo emprestimo;
	DataUtil dataUtilMock;
	DataUtil dataUtilSpy;

	@Before
	public void setUp() throws Exception {

		emprestimo = new Emprestimo();
		dataUtilMock = Mockito.mock(DataUtil.class);
		dataUtilSpy = Mockito.spy(DataUtil.class);
	}

	@Test
	public void testAprovaPagamentoMock() {
		Mockito.when(dataUtilMock.PrazoPagamento(10)).thenReturn(60);
		assertEquals(emprestimo.aprovaPagamento(dataUtilMock, 10), 60);
	}

	@Test
	public void testAprovaPagamentoSpy() {
		Mockito.when(dataUtilSpy.PrazoPagamento(10)).thenReturn(60);
		assertEquals(emprestimo.aprovaPagamento(dataUtilSpy, 10), 60);
	}

}
