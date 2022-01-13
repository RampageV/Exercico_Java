package Servico;

import Entidade.Conta;
import Util.APIConnection;
import Util.DataBaseConnection;

public class Saque {

	private APIConnection apiconnection;
	private DataBaseConnection bdconnection;

	public void realizarSaque(Conta conta, Double valor) {

		if (possueSaldo(conta, valor) && (apiconnection.consultaSPC(conta.getUsuario().getNome()))) {
			conta.setSaldo(conta.getSaldo() - valor);
			bdconnection.insertConta(conta);
		}else {
			System.out.println(apiconnection.consultaSPC(conta.getUsuario().getNome()));
		}
	}

	private Boolean possueSaldo(Conta conta, Double valor) {

		if (conta.getSaldo() >= valor) {
			return true;
		} else {
			return false;
		}
	}

	public APIConnection getApiconnection() {
		return apiconnection;
	}

	public void setApiconnection(APIConnection apiconnection) {
		this.apiconnection = apiconnection;
	}

	public DataBaseConnection getBdconnection() {
		return bdconnection;
	}

	public void setBdconnection(DataBaseConnection bdconnection) {
		this.bdconnection = bdconnection;
	}



}