package SWAPI;

public class Main {

	public static void main(String[] args) {

		// Instanciando a classe Pilotos_Personagens
		Pilotos_Personagens piloto = new Pilotos_Personagens();
		// Instanciando a classe PersonagemApareceMais
		PersonagemApareceMais Personagem = new PersonagemApareceMais();

		// Chamando os m�todos das classe que s�o void
		piloto.PilotosDaFalcon();
		Personagem.Personagem_Aparece_Mais();
	}

}
