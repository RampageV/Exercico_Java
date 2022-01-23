package stopDefinitios;

import java.security.KeyStore;
import java.sql.Driver;
import org.openqa.selenium.By;
import static utils.Utils.*;

public class LoginSteps {
	
	public void InformarCampoUsuario(String usuario) {

		driver.findElement(By.name("txtUsername")).sendKeys(usuario);
		; // findElement � como voc� localiza
	}

	public void InformarCampoSenha(String senha) {

		driver.findElement(By.name("txtPassword")).sendKeys(senha);
		; // findElement � como voc� localiza

	}

	public void AcinarBotaoLogin() {

		driver.findElement(By.name("submit")).click();
		; // findElement � como voc� localiza

	}
}
