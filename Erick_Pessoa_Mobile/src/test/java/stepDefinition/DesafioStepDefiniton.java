package stepDefinition;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DesafioPage;
import static util.DesafioUlti.*;

public class DesafioStepDefiniton {

	DesafioPage desafio = new DesafioPage(driver);

	@Quando("clica no botao do centro")
	public void clicaNoBotaoDoCentro() {

		desafio.BotaoCentroo();
	}

	@Quando("depois no botao mais")
	public void depoisNoBotaoMais() {

		desafio.BotaoMaiss();
	}

	@Quando("clica no titulo e coloca o nome {string}")
	public void clicaNoTituloEColocaONome(String string) {

		desafio.tituloNome();
	}

	@Quando("confirmar o seu titulo")
	public void confirmarOSeuTitulo() {

		desafio.ConfirmarTitulo();
	}

	@Quando("clica no botao de sair do titulo")
	public void clicaNoBotaoDeSairDoTitulo() {

		desafio.SairDeTodoTitulo();
	}

	@Quando("clica no botao colo")
	public void clicaNoBotaoColo() {

		desafio.ClicaNaCor();
	}

	@Quando("escolhe a cor vermelha para seu app")
	public void escolheACorVermelhaParaSeuApp() {

		desafio.corVermelha();
	}

	@Quando("click no remetente")
	public void clickNoRemetente() {

		desafio.RemetenteApp();
	}

	@Quando("depois escolhe o remetente")
	public void depoisEscolheORemetente() {

		desafio.EscolhendoMelhorRemetente();
	}

	@Quando("depois que foi escolhido aperta em done")
	public void depoisQueFoiEscolhidoApertaEmDone() {

		desafio.EscolhendoMelhorRemetente();
	}

	@Quando("entra no note")
	public void entraNoNote() {
		desafio.EntrandoNoNote();
	}

	@Quando("clica nos tres pontos")
	public void clicaNosTrSPontos() {
		desafio.TresPontos();
	}

	@Quando("Clica em check list")
	public void clicaEmCheckList() {
		desafio.CheckClick();
	}

	@Quando("confirma o ok")
	public void confirmaOOk() {
		desafio.ConfirmandoOk();
	}

	@Quando("deleta o projeto")
	public void deletaOProjeto() {
		desafio.Deletando();
	}

	@Entao("voce confirma o dele")
	public void voceConfirmaODele() {
		desafio.DeleteConfirmado();
	}

}
