package Modelo;

import java.util.List;

public class Pessoa {

	public enum TipoPessoa {
		JURIDICA, 
		FISICA
	}

	public String nome;
	public int codigo;
	public String documento;
	public TipoPessoa tipo;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

}
