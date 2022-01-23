package pageObjects;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import stopDefinitios.LoginSteps;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginPage {

	LoginSteps lg = new LoginSteps();

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		lg.InformarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {

		lg.InformarCampoSenha(senha);
	}

	@Quando("clica no botao login")
	public void clicaNoBotaoLogin() {
		lg.AcinarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials", driver.findElement(By.name("spanMessage")).getText());
	}

	@Entao("o sistema exibe usuario logado")
	public void oSistemaExibeUsuarioLogado() {
		assertEquals("Welcome Paul", driver.findElement(By.name("welcome")).getText());
	}

}
