package Modelo;

import java.util.List;

public class Pessoa {

	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;

	public enum TipoPessoa {
		JURIDICA, FISICA
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

	public void SetDocumento(String documento) {

		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser null ou vazio");
		}

		if (documento.length() == TAMANHO_CPF) {
			SetDocumento(documento, tipo = TipoPessoa.FISICA);

		} else if (documento.length() == TAMANHO_CNPJ) {
			SetDocumento(documento, tipo = TipoPessoa.JURIDICA);

		} else {

			throw new RuntimeException("Documento invalido para pessoa física ou juridica");
		}

		this.documento = documento;
	 }

	public void SetDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	

}
