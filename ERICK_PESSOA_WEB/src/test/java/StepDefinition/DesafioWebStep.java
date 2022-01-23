package StepDefinition;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PageDesafioWeb;
import static util.DesafioUlti.*; 

public class DesafioWebStep {

	PageDesafioWeb desafioWeb = new PageDesafioWeb();
	
	@Quando("informar o usuario {string}")
	public void informarOUsuario(String usuario) {
	    desafioWeb.informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	  desafioWeb.informarCampoSenha(senha);
	}

	@Entao("aberta em acessar")
	public void abertaEmAcessar() {
	  desafioWeb.informarCampoLogar();
	}
	
	@Quando("colocar o menor preco")
	public void colocarOMenorPreO() {
	   
		desafioWeb.filtraPreço();
		desafioWeb.filtraMenoParaMaior();
	}
	
	@Quando("adicionar e remover")
	public void adicionarERemover() {
	   desafioWeb.ClicaNaRoupa();
	   desafioWeb.ClicaNoCarrinho();
	   desafioWeb.ClicaRemoverDoCarrinho();
	   desafioWeb.ClicaEmCheckot();
	}
	
	@Quando("colocar name {string}")
	public void colocarName(String nome) {
	    desafioWeb.informarCampoName(nome);
	}

	@Quando("Colocar last {string}")
	public void colocarLast(String sobrenome) {
	   desafioWeb.informarCampoSobrenome(sobrenome);
	}

	@Quando("code postal {string}")
	public void codePostal(String code) {
	 desafioWeb.informarCampoSobrePoste(code);
	}

	@Quando("clica no botao continuar")
	public void clicaNoBotaoContinuar() {
	    desafioWeb.ClicarEmContinuar();
	}
	
	@Entao("CalcelarCompra")
	public void calcelarcompra() {
	 desafioWeb.CancelarCompras();
	}
	
}
