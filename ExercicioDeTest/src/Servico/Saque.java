package Servico;

import Entidade.Conta;

public class Saque {

	public void realizarSaque(Conta conta, Double valor) {

		if (possueSaldo(conta, valor)) {
			conta.setSaldo(conta.getSaldo() - valor);
		}
	}

	private Boolean possueSaldo(Conta conta, Double valor) {

		if (conta.getSaldo() >= valor) {
			return true;
		} else {
			return false;
		}
	}

}