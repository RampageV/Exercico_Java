package Util;

import Entidade.Banco;
import Entidade.Conta;

public interface DataBaseConnection {

	public void insertSaque(Conta conta);

	public void insertConta(Conta conta);

	public void insertBanco(Banco banco);

}
