package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe"); // Caminho
		driver = new ChromeDriver(); // Chamando o objeto
		driver.manage().window().maximize(); // Quando abrir o navagador, abrir em tela cheia
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Acada exercu��o que ele fizer, espera at� 5																// segundos
		driver.get("https://opensource-demo.orangehrmlive.com/");// P�gina que eu quero que ele abra

	}

}
