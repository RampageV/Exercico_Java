package stepDefinitios;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils2.*;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicialPage = new TelaInicialPage(driver);

	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() {
	    telaInicialPage.AcionarBotaoGetStart();
	}

	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) {
	 telaInicialPage.InformacaoCampoTitle(title);
	   
	}

	@Quando("eu informar no campo note {string}")
	public void euInformarNoCampoNote(String string) {
	  
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
	    telaInicialPage.AcionarBotãoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String title) {
	   
		assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());
	}
}
