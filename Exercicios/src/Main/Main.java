package Main;

import Modelo.Cliente;
import Modelo.Endereco;

public class Main {

	public static void main(String[] args) {

		
		
		// Dados do endereço
		Endereco endereco = new Endereco();
		
		
		
        // Dados do cliente		
		Cliente cliente = new Cliente();
		
		
		try {
			
			cliente.AdicionaEndereço(endereco);
			System.out.println("Tudo certo");
			
		}catch (Exception e) {
			System.out.println("Houve um Erro: " + e.getMessage());
		}

	}

}
