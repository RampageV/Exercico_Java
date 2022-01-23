package pageObjects;

import static util.DesafioUlti.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageDesafioWeb {

	// Métodos
	public void informarCampoUsuario(String usuario) {
		driver.findElement(By.name("user-name")).sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		driver.findElement(By.name("password")).sendKeys(senha);
	}
	
	public void informarCampoLogar() {
		driver.findElement(By.name("login-button")).click();
	}
	
	public void filtraPreço() {
		driver.findElement(By.className("product_sort_container")).click();
	}
	
	public void filtraMenoParaMaior() {
		WebElement selectElement = driver.findElement(By.className("product_sort_container"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByValue("lohi");
	}
	
	public void ClicaNaRoupa() {
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
	}
	
	public void ClicaNoCarrinho() {
		driver.findElement(By.className("shopping_cart_link")).click();
	}
	
	public void ClicaRemoverDoCarrinho() {
		driver.findElement(By.name("remove-sauce-labs-onesie")).click();
	}
	public void ClicaEmCheckot() {
		driver.findElement(By.id("checkout")).click();
	}
	public void informarCampoName(String nome) {
		driver.findElement(By.name("firstName")).sendKeys(nome);
	}
	public void informarCampoSobrenome(String sobrenome) {
		driver.findElement(By.name("lastName")).sendKeys(sobrenome);
	}
	
	public void informarCampoSobrePoste(String code) {
		driver.findElement(By.name("postalCode")).sendKeys(code);
	}
	public void ClicarEmContinuar(){
		driver.findElement(By.name("continue")).click();
	}
	
	public void CancelarCompras() {
		driver.findElement(By.name("cancel")).click();
	}
	


}
