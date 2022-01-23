package stepDefinitios;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import cucumber.api.PendingException;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;
import teste.Calculadora;
import static utils.Utils2.*;

public class CalculadoraSteps {

	CalculadoraPage calculadora = new CalculadoraPage(driver);
	
	@Quando("eu digito numero {string}")
	public void euDigitoNumero(String string) {
	    calculadora.digitar2();
	}
	
	@Quando("eu aciono a tecla mais")
	public void euAcionoATeclaMais() {
	 calculadora.AcionarTeclaMais();
	}

	@Quando("digito o numero {string}")
	public void digitoONumero(String string) {
	   calculadora.digitar2();
	}

	@Entao("calculadora apresenta resultado {string}")
	public void calculadoraApresentaResultado(String string) {
	  
	}


}
