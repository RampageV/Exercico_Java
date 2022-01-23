package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		features = "src\\test\\resources\\feature", // Cria��o do plugin.
		glue = "stepDefinitios", // Me fala o pacote onde tem seus steps
		snippets = SnippetType.CAMELCASE, // Ele separada os nomes dos m�todo por letra maiscula e n�o por underline.
		monochrome = true, // Deixa o console branco
		dryRun = false // Gera os passos que est�o faltando. Sempre deixe false, s� deixe true se
						// quiser gera os steps
)

public class Runner2Test {

}
