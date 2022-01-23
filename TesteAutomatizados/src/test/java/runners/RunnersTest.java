package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // Um plugin que me mostra o que o cucumber está fazendo. Os passos que estão executando.
		features = "src/test/resources/features", // Criação do plugin.
//		tags = "@loginComSucesso",
		glue = "stopDefinitios",
		snippets = SnippetType.CAMELCASE, // Ele separada os nomes dos método por letra maiscula e não por underline.
		monochrome = true, // Deixa o console branco
		dryRun = false //Gera os passos que estão faltando. Sempre deixe false, só deixe true se quiser gera os steps
		)
public class RunnersTest {

	
}
