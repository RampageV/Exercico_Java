package Servico;

import Entidade.Conta;
import Util.DataUtil;

public class Emprestimo {

	public void realizarEmprestimo(Conta conta, Double valor, int parcelas) throws Exception {

		if (conta == null) {
			throw new Exception("Usuario Vazio");
		}
	}

	public int aprovaPagamento(DataUtil dataUtil, int parcelas) {
        return dataUtil.PrazoPagamento(parcelas);
	}

}
