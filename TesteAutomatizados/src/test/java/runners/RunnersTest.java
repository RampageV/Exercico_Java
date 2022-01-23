package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // Um plugin que me mostra o que o cucumber est� fazendo. Os passos que est�o executando.
		features = "src/test/resources/features", // Cria��o do plugin.
//		tags = "@loginComSucesso",
		glue = "stopDefinitios",
		snippets = SnippetType.CAMELCASE, // Ele separada os nomes dos m�todo por letra maiscula e n�o por underline.
		monochrome = true, // Deixa o console branco
		dryRun = false //Gera os passos que est�o faltando. Sempre deixe false, s� deixe true se quiser gera os steps
		)
public class RunnersTest {

	
}
