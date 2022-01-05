package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

	public String numCartao;
	private List<Endereco> endereco;

	public void AdicionaEndere�o(Endereco endereco) {

		if (endereco == null) {
			throw new NullPointerException("Endere�o n�o pode ser Nullo");
		}
		if (endereco.cep == null) {
			throw new NullPointerException("Cep n�o pode ser Nullo");

		}

		getEndereco().add(endereco);
	}

	private List<Endereco> getEndereco() {

		if (endereco == null) {
			endereco = new ArrayList<Endereco>();
		}

		return endereco;
	}
}
