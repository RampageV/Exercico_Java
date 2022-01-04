package Modelo;

public class Endereco {

	public enum TiposEndereco {
		RESIDENCIAL,
		ENTREGA,
		TRABALHO
	}
	
	public String endereco;
	public String endereco_numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	
}
