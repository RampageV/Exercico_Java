package Main;


import java.util.Arrays;
import Modelo.Cliente;
import Modelo.Endereco;

public class Main {

	public static void main(String[] args) {

	
		Endereco enderco = new Endereco();
		
		enderco.cep = "000000000";
		
		Cliente cliente = new Cliente();
		
		try {
			
			cliente.AdicionaEndereço(enderco);
			System.out.println("Endereço adicionado com sucesso");
		}catch(Exception e) {
			System.out.println("Houve um problema: " + e.getMessage());;
		}
		
		
		
		
		
	}
}
	


