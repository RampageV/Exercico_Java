package Main;

import Modelo.Cliente;
import Modelo.Endereco;

public class Main {

	public static void main(String[] args) {

		
		
		Endereco endereco = new Endereco();
		
		Cliente cliente = new Cliente();
		
		cliente.endereco.add(endereco);

	}

}
